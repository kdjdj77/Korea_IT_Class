/*mousefollow*/
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
/*fullscreen-----------------------------------------------------*/
window.addEventListener("wheel",
   function(e)
   {
      console.log(e);
      if (e.deltaY > 0)
      {
         window.scrollBy({
            top:window.innerHeight,
            left:0,
            behavior:"smooth",
         });
      }
      else
      {
         window.scrollBy({
            top:-window.innerHeight,
            left:0,
            behavior:"smooth",
         });
      }
   }
);
/*banner-----------------------------------------------------*/
const bannerBox = document.querySelector("#bannerBox > ul");
const bannerItem = document.querySelectorAll(".bannerItem");
//배열 반환

const prevBtn = document.getElementById("prevBtn");
const nextBtn = document.getElementById("nextBtn");

const size = bannerItem[0].clientWidth;
//패딩을 포함한 가로길이를 가지고오는 기능

//function(){} === () => {}
//click, wheel, mouseover, mouseleave, mouseclick, keypress..

let counter = 0;

//addEventListner
//이벤트 동작
nextBtn.addEventListener('click',
   function() 
   {
      clearInterval(banner);
      if (counter < bannerItem.length - 1)
      {
         counter++;
         bannerBox.style.transform = "translateX(" + (-size * counter) + "px)";
      }
      else if (counter == bannerItem.length - 1)
      {
         counter = 0;
         bannerBox.style.transform = "translateX(" + (-size * counter) + "px)";
      }
   }
);
prevBtn.addEventListener('click', 
   function() 
   {
      clearInterval(banner);
      if (counter > 0)
      {
         counter--;
         bannerBox.style.transform = "translateX(" + (-size * counter) + "px)";
      }
      else if (counter == 0)
      {
         counter = bannerItem.length - 1;
         bannerBox.style.transform = "translateX(" + (-size * counter) + "px)";
      }
   }
);

/*
setInterval : 반복

ex)
setInterval(() => {
   실행할문장
}. 반복할시간)
*/
let banner = setInterval(
   function()
   {
      if (counter < bannerItem.length - 1)
      {
         counter++;
         bannerBox.style.transform = "translateX(" + (-size * counter) + "px)";
      }
      else if (counter == bannerItem.length - 1)
      {
         counter = 0;
         bannerBox.style.transform = "translateX(" + (-size * counter) + "px)";
      }
   }, 5000
);

/*hidemenu-----------------------------------------------------*/
const header = document.querySelector("header");
const hideMenu = document.querySelector(".hideMenu");
/*class보다 id가 우선순위가 높다*/

/*hidemenu class에 "on"이 포함되어 있다면 삭제 반대면 생성*/
header.addEventListener("mouseover",
   function()
   {
      if (hideMenu.classList.contains("on"))
         hideMenu.classList.remove("on");
      else 
         hideMenu.classList.add("on");
   }
);
hideMenu.addEventListener("mouseleave",
   function()
   {
      if(hideMenu.classList.contains("on"))
         hideMenu.classList.remove("on");
      else 
         hideMenu.classList.add("on");
   }
);