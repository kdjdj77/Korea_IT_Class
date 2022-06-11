const bannerBox = document.querySelector("#bannerBox > ul");
const bannerItem = document.querySelectorAll(".bannerItem");
//배열 반환

const prevBtn = document.getElementById("prevBtn");
const nextBtn = document.getElementById("nextBtn");

const size = bannerItem[0].clientWidth;
//패딩을 포함한 가로길이를 가지고오는 기능

//function(){} === () => {}
//click, wheel, mouseover, mouseleave, mouseclick, keypress..

//1. 처음으로 돌아가는거

let counter = 0;

//addEventListner
//이벤트 동작
nextBtn.addEventListener('click', 
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
   }
);
prevBtn.addEventListener('click', 
   function() 
   {
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
setInterval(
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