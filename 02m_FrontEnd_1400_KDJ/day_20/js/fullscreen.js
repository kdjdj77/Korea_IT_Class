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
/*
해당 이벤트는 마우스 과다 중복을 막기 위해 함수를 구현해야
제대로 된 기능을 할 수 있음

하지만 해당 함수는 구현이 힘들고
구현했다 하더라도 

footer라던지 모바일이라던지 더 구현해야 할 부분이 많으므로
왠만하면 라이브러리를 사용하여 풀페이지를 구현
*/