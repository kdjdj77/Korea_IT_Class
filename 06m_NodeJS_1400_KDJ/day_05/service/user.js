import bcrypt from "bcrypt";
import User from "../models/user.js";

class UserService {
   static async signUp(req, res, next) {
      try {
         console.log(req.body);
         // findOne 최상단 데이터 한가지 검색 (객체형태)
         // findAll은 전부 검색 (배열형태)
         const exUser = await User.findOne({
            where: {
               email: req.body.email,
            },
         });
         if (exUser) {
            return res.status(403), send('이미 사용중인 이메일입니다');
         }
         // 단방향 암호화 (복호화 절대불가능)
         const hashedPassword = await bcrypt.hash(req.body.password, 12);
         // 암호화의 단계 (보통 8 ~ 12)

         await User.create({
            email: req.body.email,
            password: hashedPassword,
         });
         res.status(200).send("ok");        
      } catch(err) {
         console.error(err);
         next(err);
      }
   }
}
export default UserService;