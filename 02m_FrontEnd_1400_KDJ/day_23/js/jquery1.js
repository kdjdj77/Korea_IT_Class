$(function() {
   $(".hdrWrap h2").click(function() {
      $(".navWrap").slideDown();
   });
   $(".hdrWrap h2").mouseleave(function() {
      $(".navWrap").slideUp();
   });
});