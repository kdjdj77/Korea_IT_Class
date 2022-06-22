package com.lec.java.regexp01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 정규표현식 regular expression  (regexp)
 * 
 * 문자열 검색, 치환  등의 동작에 있어서
 * 단순한 '문자열 비교' 를 하는 것이 아니라 
 * 특정 '패턴'과 비교하고자 할때 이를 단 몇줄의 코드로 구현 가능!
 * 주어진 문자열에서 패턴을 찾아내는 것을 '패턴 매칭(pattern matching)' 이라 함
 * 
 * 사용자가 입력한 문자열 패턴 유효성 체크 등에 많이 사용
 * 		ex) 주민등록번호, URL, email, 비밀번호, 
 * 			날짜포맷(yyyy-mm-dd) 
 * 			전화번호(010-xxxx-xxxx) ... 
 * 
 * 자바는 java.util.regex 에서 관련 클래스들 제공
 * 		Pattern, Matcher ..
 * 
 * 일반적인 작성단계
 * 	 1) 주어진 정규표현식을 구현하는 Pattern 객체 생성
 *   2) 패턴 매칭 수행객체 Matcher 생성
 *   3) Matcher 객체로부터 패턴매칭을 수행하여  검색, 치환등의 동작
 * 
 * 장점: 코딩량 저감, 거의 대부분의 언어에서 공용으로 사용.
 * 단점: 처음에 배우기 어렵고, 코드 가독성 떨어뜨림.
 * 
 * 정규표현식을  사용하는 String 메소드들:
 * 	matches(), split(), replaceAll(), replaceFirst()
 * 
 * 정규표현식 연습 사이트 추천
 * : https://regexr.com/    (정규식 , 문자열 매칭 연습)
 * : https://regexone.com/  ( step by step 으로 연습 하기 좋음)
 * : https://regexper.com/  (특징: 시각화, 정규식을 이미지로 다운가능)
 * : https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html  (오라클 공식)
 * ─────────────────────────────────────────────────────────────
 * 	정규표현식		설명
 * 	^			문자열 시작
 * 	$			문자열 종료
 * 	.			임의의 문자 [단 ‘'는 넣을 수 없습니다.]
 * 	*			앞 문자가 0개 이상의 개수가 존재할 수 있습니다.
 * 	+			앞 문자가 1개 이상의 개수가 존재할 수 있습니다.
 * 	?			앞 문자가 없거나 하나 있을 수 있습니다.
 * []			문자의 집합이나 범위를 표현합니다. -기호를 통해 범위를 나타낼 수 있습니다. ^가 존재하면 not을 나타냅니다.
 * {}			횟수 또는 범위를 나타냅니다.
 * ()			괄호안의 문자를 하나의 문자로 인식합니다.
 * |			패턴을 OR 연산을 수행할 때 사용합니다.
 * \s			공백 문자
 * \S			공백 문자가 아닌 나머지 문자
 * \w			알파벳이나 문자
 * \W			알파벳이나 숫자를 제외한 문자
 * \d			[0-9] 숫자
 * \D			숫자를 제외한 모든 문자
 * (?i)			대소문자를 구분하지 않습니다.
 */
public class RegExp01Main {

	public static void main(String[] args) {
		System.out.println("정규표현식 regular expression");
		
		String input;
		String regex;
		Pattern pat;
		Matcher matcher;
		
		System.out.println();
		System.out.println("■ 정규표현식 객체, 메소드 연습");
		System.out.println("패턴] .  ← 임의의 문자 하나");
		
		// 1).주어진 정규표현식을 구현하는 Pattern 객체 생성
		// Pattern.compile(정규표현식 문자열) 사용  

		regex = "My....";   // My 로 시작하고 임의의 문자4개 ㄴ
		pat = Pattern.compile(regex);
		
		input = "-My1234-";
//		input = "This is My Birthday";
//		input = "Myage";
		System.out.println("input: " + input);
		
		
		// 2) 패턴 매칭 수행객체 Matcher 생성
		// Pattern 의 matcher() 사용
		// Pattern을 사용해서 주어진 문자열에서 패턴 매칭할 객체 생성 --> Matcher객체 리턴
		// (아직 패턴 매칭을 진행하진 않았다)
		matcher = pat.matcher(input);

		
		// 3) Matcher 객체로부터 패턴매칭을 수행하여  검색, 치환등의 동작  
		//  find() '다음' 패턴매칭 검색 , 패턴매칭 발견하면 true 아니면 false 리턴
		//  group() 바로 직전에 패턴매칭된 문자열 String 리턴
		//  reset() 다시 처음부터 패턴매칭하도록 reset 함.
		//  replaceFirst() : 첫번째 매칭을 치환
		//  replaceAll() : 모든 매칭을 치환
		//  matches() : 패턴매칭이 '문자열 전체영역' 이 패턴매칭 되는지 여부
		//  start() : 최근 매칭의 시작 index, 
		//  end() : 최근 매칭의 끝 index (마지막 매칭된 문자 '다음' 인덱스값)
		
		if(matcher.find()) {
			System.out.println(matcher.group() + " {" + matcher.start() + "~" + matcher.end() + "}");
		} else {
			System.out.println("find() 실패");
		}

		// 또 다시 실행하면?  다음 패턴매칭을 시도한다 --> 결과는 실패!
		if(matcher.find()) {
			System.out.println(matcher.group() + " {" + matcher.start() + "~" + matcher.end() + "}");
		} else {
			System.out.println("find() 실패");
		}
		
		
		// reset() 다시 처음부터 패턴매칭하도록 reset 함.
		matcher = matcher.reset();
		
		// reset() 후 다시 시도하면 매칭 성공!
		if(matcher.find()) {
			System.out.println(matcher.group() + " {" + matcher.start() + "~" + matcher.end() + "}");
		} else {
			System.out.println("find() 실패");
		}
		
		
		// replaceFirst() : 첫번째 매칭 패턴을 치환하여 결과 리턴
		System.out.println(matcher.replaceFirst("XXXX"));
		
		
		// matches()
		// 패턴매칭이 '문자열 전체영역' 이 패턴매칭 되는지 여부
		System.out.println();
		System.out.println("matches()");
		matcher = pat.matcher("-My1234-");
		
		if(matcher.matches()) {
			System.out.println("matches() 매칭 OK");
		} else {
			System.out.println("matches() 매칭 FAIL");
		}

		matcher = pat.matcher("My1234");
		
		if(matcher.matches()) {
			System.out.println("matches() 매칭 OK");
		} else {
			System.out.println("matches() 매칭 FAIL");
		}

		System.out.println();
		System.out.println("Pattern.matches(regex, input) 사용");
		// 단순히 '문자열 전체영역' 이 패턴에 맞는지 여부 만 확인하려면 간단하게 Pattern.matches() 사용하자.
		// Pattern.matches()는 내부적으로 정확히 아래와 같이 동작하게 된다.
		//     Pattern.compile(regex).matcher(input).matches()
		
		if(Pattern.matches("My....", "Myabcd")) {
			System.out.println("Pattern.matches() 매칭 OK");
		} else {
			System.out.println("Pattern.matches() 매칭 FAIL");
		}
		

		System.out.println();
		System.out.println("■ 여러개 패턴 검색");
		
		// 과연 "My...." 으로 몇개가 매칭되나?  : 예측해보자
		// 기본적으로 대소문자를 구분하여 매칭한다
		input = "-My98KK-myABCD--My1234567--MyZZ---My789";  // 3개 매칭
		matcher = pat.matcher(input);  // Matcher 생성
		
		System.out.println(input);
		while(matcher.find()) {
			System.out.println(matcher.group() + " {" + matcher.start() + "~" + matcher.end() + "}");
		}
		
		
		System.out.println();
		
		System.out.println(matcher.replaceFirst("***"));	
		System.out.println(matcher.replaceAll("***"));	
		
		System.out.println();
		System.out.println("find(fromIndex)");  // fromIndex부터 검색

		matcher = pat.matcher(input);
		int fromIndex = 16;
		while(matcher.find(fromIndex)) {
			System.out.println(matcher.group() + " {" + matcher.start() + "~" + matcher.end() + "}");
			fromIndex = matcher.end();
		}

		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class

