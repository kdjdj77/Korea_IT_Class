"use strict";

/*
배열 반환
document.querySelectorAll
document.getElementsByClassName
*/

/* 마우스를 따라다니는 원
const circle = document.getElementById("circle");
document.addEventListener("mousemove",
   function(e)
   {
      const mouseX = e.clientX;  //움직이고 있는 마우스의 x좌표
      const mouseY = e.clientY;  //움직이고 있는 마우스의 y좌표

      circle.style.left = mouseX + "px";
      circle.style.top = mouseY + "px";
   }
)
*/

const font = document.getElementById("font");
const container = document.getElementById("container");
document.addEventListener("mousemove", 
   function(e)
   {
      const mouseX = e.clientX;  //움직이고 있는 마우스의 x좌표
      const mouseY = e.clientY;  //움직이고 있는 마우스의 y좌표
      console.log(mouseX, mouseY);

      if (mouseY > 48 && mouseX < 1830)
      {
         font.style.display = "block";
         font.style.left = mouseX + "px";
         font.style.top = mouseY + "px";
      }
      else font.style.display = "none";
   }
)

container.addEventListener("click",
   function()
   {
      if (font.innerText === "Pause") 
      {
         font.innerText = "Play";
         setTimeout(
            function()  //3초뒤에 퍼즈로 바뀜
            {
               font.innerText = "Pause";
            }, 3000
         )
      }
      else font.innerText = "Pause";
   }
)
