$(document).ready(function() {
	fullset();
	quickClick();
});
function fullset() {
	let pageindex = $("#fullpage > .fullsection").size();
	for(let i=1;i<=pageindex;i++) $("#fullpage > .quick > ul").append("<li></li>");
	$("#fullpage .quick ul :first-child").addClass("on");

	//마우스 휠 이벤트
	$(window).bind("mousewheel", function(event){
		let page = $(".quick ul li.on");
		if($("body").find("#fullpage:animated").length >= 1) return false;

		//마우스 휠을 위로
		if(event.originalEvent.wheelDelta >= 0) {
			let before=page.index();
         //퀵버튼옮기기
			if(page.index() >= 0) page.prev().addClass("on").siblings(".on").removeClass("on");
			let pagelength = 0;
			for(let i = 1; i < (before); i++) pagelength += $(".full" + i).height();

			if(page.index() > 0){ //첫번째 페이지가 아닐때 (index는 0부터 시작임)
				page = page.index() - 1;
				$("#fullpage").animate({"top": -pagelength + "px"}, 700, "swing");
			}
		}
      // 마우스 휠을 아래로
      else { 
         let nextPage=parseInt(page.index() + 1); //다음페이지번호
			let lastPageNum=parseInt($(".quick ul li").size()); //마지막 페이지번호

			if(page.index() <= $(".quick ul li").size()-1){ 
				page.next().addClass("on").siblings(".on").removeClass("on");
			}
			
			if(nextPage < lastPageNum){ //마지막 페이지가 아닐때만 animate !
				let pagelength = 0;
				for(let i = 1; i<(nextPage+1); i++) pagelength += $(".full"+i).height();
            $("#fullpage").animate({"top": -pagelength + "px"}, 700, "swing");
			}
		}
	});
	$(window).resize(function(){ 
		let resizeindex = $(".quick ul li.on").index()+1;
		let pagelength=0;
		for(let i = 1; i<resizeindex; i++) pagelength += $(".full"+i).height();
      $("#fullpage").animate({"top": -pagelength + "px"},0);
	});
}

// 사이드 퀵버튼 클릭 이동
function quickClick(){
	$(".quick li").click(function(){
		let gnbindex = $(this).index()+1;
		let length=0;
		for(let i=1; i<(gnbindex); i++)
         length+=$(".full"+i).height();
		if($("body").find("#fullpage:animated").length >= 1) return false;
		$(this).addClass("on").siblings("li").removeClass("on");
		
		$("#fullpage").animate({"top": -length + "px"}, 700, "swing");
		return false;
	});
}