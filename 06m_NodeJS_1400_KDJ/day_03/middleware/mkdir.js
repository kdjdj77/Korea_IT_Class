import fs from "fs";
export const mkdir = () => {
   try {
      fs.readdirSync("uploads");
   } catch (error) {
      fs.mkdirSync("uploads/");
   }
};