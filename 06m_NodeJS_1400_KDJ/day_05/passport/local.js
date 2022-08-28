import passport from "passport";
import passportLocal from "passport-local";
import User from "../models/user.js";
import bcrypt from "bcrypt";

const LocalStrategy = passportLocal.Strategy;

const passportConfig = {
   usernameField: "email",    //usernameField : 고정
   passwordField: "password", //passwordField : 고정
};

const passportVerify = async function(email, password, done) {
   try {
      const user = await User.findOne({where: {email}});
      if(!user) {
         return done(null, false, {
            message: "failure", 
            error: "가입되지 않은 회원입니다"
         });
      }
      const result = await bcrypt.compare(password, user.password);
      //return boolean
      if(result) {
         return done(null, user);
      } else {
         return done(null, false, {
            message: "failure",
            error: "비밀번호가 올바르기 않습니다",
         });
      }
   } catch(err) {
      console.log(err);
      return done(err);
   }
}

export default function() {
   return passport.use("local", new LocalStrategy(passportConfig, passportVerify));
}