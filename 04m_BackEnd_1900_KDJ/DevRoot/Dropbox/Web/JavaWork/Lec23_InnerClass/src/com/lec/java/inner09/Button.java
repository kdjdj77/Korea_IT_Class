package com.lec.java.inner09;

//Button 객체를 개발하여 제공하는 측의 코드
public class Button {

	String name;
	
	public Button(String name) {
		this.name = name;
	}
	
	// 클릭시 수행하는 리스너  제공
	// 리스너 인터페이스 : OnClickListener
	//         - 를릭시 동작 메소드 : onClick();
	// 장착 메소드 : setOnClickListener
	//---------------------------------------------------
	// 리스너 인터페이스
	// TODO
	
	// 장착 리스너
	// TODO  
	
	// 리스너 장착 메소드
	// TODO
	
	//----------------------------------------------
	public void actionClick() {
		System.out.println(name + " 버튼 클릭!");
		
		// TODO
		
	}
	
	
	// TODO
	// 더블클릭시 수행하는 리스너를  제공해보세요
	// 리스너 인터페이스 : OnDblClickListener
	//         - 더블를릭시 동작 메소드 : onDblClick();
	// 장착 메소드 : setOnDBlClickListener
	
	//---------------------------------------------------
	// 리스너 인터페이스
	// TODO
	
	// 장착 리스너
	// TODO  
	
	// 리스너 장착 메소드
	// TODO
	
	//----------------------------------------------
	public void actionDblClick() {
		System.out.println("--------------------");
		System.out.println(name + " 버튼 클릭!");
		System.out.println("버튼 클릭 동작 공통 처리 동작들A");

		// TODO : 장착된 리스너의 동작 수행
		
		System.out.println("버튼 클릭 동작 공통 처리 동작들B");
		System.out.println("--------------------");
	}
	
	
	
	
} // end class
