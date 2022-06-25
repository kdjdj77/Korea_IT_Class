//day90-1_script.js
$(function () {
   let $wrapper = $(".wrapper"),
     $prev = $(".btPrev"),
     $next = $(".btNext"),
     pageNum = 0,
     pageWidth = $wrapper.find(".page").outerWidth(),
     delta = 0,
     scrollEvt = false;
   $prev.on("click", prevPage);
   $next.on("click", nextPage);
   $(window).on("resize", function () {
     pageWidth = $wrapper.find(".page").outerWidth();
     if (pageWidth > 1080) {
       console.log("문서가 1080보다 큽니다.");
     } else if (pageWidth > 780) {
       console.log("문서가 780보다 큽니다.");
     } else if (pageWidth > 420) {
       console.log("문서가 420보다 큽니다.");
     }
   });
   $(".content").on("mousewheel", function (e) {
     delta = e.originalEvent.wheelDelta;
     if (delta > 0 && scrollEvt == false) {
       prevPage();
     } else if (delta < 0 && scrollEvt == false) {
       nextPage();
     }
   });
 
   function prevPage() {
     scrollEvt = true;
     if (pageNum > 0) pageNum--;
     $("html").animate({ scrollLeft: pageWidth * pageNum }, function () {
       scrollEvt = false;
     });
   }
 
   function nextPage() {
     scrollEvt = true;
     if (pageNum < 5) pageNum++;
     $("html").animate({ scrollLeft: pageWidth * pageNum }, function () {
       scrollEvt = false;
     });
   }
 });