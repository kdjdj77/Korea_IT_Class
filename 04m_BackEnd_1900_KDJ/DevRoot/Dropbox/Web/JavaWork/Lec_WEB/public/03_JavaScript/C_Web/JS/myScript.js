/**
 * TODO
 */

 function light(sw){
   let pic;

   if(sw == 0){
       pic = "https://www.w3schools.com/html/pic_bulboff.gif"
   } else {
       pic = "https://www.w3schools.com/html/pic_bulbon.gif"
   }

   document.getElementById('myImage').src = pic;
}