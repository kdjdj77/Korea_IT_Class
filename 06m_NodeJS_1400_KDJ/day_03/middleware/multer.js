import multer from "multer";
import path from "path";

const upload = multer({
   storage: multer.diskStorage({
       destination(req, file, done) {
           done(null, "uploads"); //도착지 설정 done(error, 폴더명)
       },
       filename(req, file, done) {
           // 파일 이름의 확장자명
           const ext = path.extname(file.originalname);
           done(
               null,
               path.basename(file.originalname, ext) + Date.now() + ext
           );
           // 확장자를 제외한 파일명 + 현재 시간 + 확장자명
       },
   }),
   limits: { fileSize: 5 * 1024 * 1024 },
   // 기준은 byte 5MB
});
export default upload;