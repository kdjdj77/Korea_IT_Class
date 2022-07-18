/* 
    JavaScript
        최초개발: 1994. (구)넷스케이프 커뮤니케이션스  (브라우저 시장에서 MS에 패한후 이후 AOL에 인수당함)
        당시 넷스케이프 브라우저에서 기존의 정적인 HTML 페이지에 동적인 기능을 가능케 하기 위한 'Script 언어'로서 개발
        개발자 '브렌던 아이크(Brenden Eich)'
        현재운영: 모질라 재단  (구, 넷스케이프 개발자들이 나와서 만든 모질라 커뮤니티가 오늘날 모질라 재단의 모체)
            https://developer.mozilla.org/ko/docs/Web/JavaScript            

        상표권자: 오라클.  (모질라 재단과 라이선스 하에 운용됨)

    스크립트 표준 : ECMAScript (에크마 스크립트)
        위 JavaScript 를 기반으로 만든 범용 스크립트 언어 표준안. ECMA-262 로 제정됨 ( https://tc39.es/ecma262/ )
        언어가 준수해야 할 규첵, 세부사항 규정.
        ECMAScript1 첫등장 (1997.7)        
        JavaScript 의 버젼(?)으로 이해해도 됨

    ECMA : Ecma International. 정보와 통신 시스템을 위한 국제적 표준화 기구
    TC39 : ECMA의 여러 기술 위원회 중 ECMA-262(범용 목적의 스크립트 언어에 대한 명세를 규정한 하나의 기술 규격) 명세의 관리를 담당하는 위원회

    역사참조: https://www.youtube.com/watch?v=wcsVjmHrUQg   (꼭 함 보세요)

    JavaScript 는 Java 와 관련이 없다!!!  (오리너구리는 오리가 아니다.)
	    (둘다 C언어 구문을 계승한 부분은 닮았다..)

    중요 버전
 	    ES5(2009) : 대부분의 브라우저에 지원, (웹페이지 작성 기준?)
 	    ES6(2015) : 가장 많은 변화, (IE 지원안함)

    ES6
        ECMASCript6. 2015 도입. 'ES2015' 라고도 함
    
        오늘날 JavaScript 의 기본형태는 ES5, ES6 에서 거의 대부분 잡혀짐.
        ES5 (2009) --> ES6 (2015) 로 넘어오면서 JS에 큰 변화들 발생
        (그래서 ES6 및 이후 버젼들을 통칭해서 ES6 라고도 퉁(?)쳐 부르기도 함)
        
        이후 TC39는 매년 새로운 기능이 추가된 버젼을 공개하고 있고, 계속 진화하는 중입니다.
    
    modern javascript ?
        ES6 및 이후에 등장한 문법으로 JavaScript 프로그래밍 하는 것을 말하며
        오늘날 주요 JavaScript 프레임워크들은 ES6 이상의 학습이 반드시 필요하다. 


    그러나, 기본적인 웹개발시에는 ES5 급 정도면 충분히 가능.
    처음부터 굳이 새로운 버젼을 다 알려 할 필요 없슴 (불가능...)
    강의, 학습, 실습 시 배우고 사용하는 내용을 기반으로 필요한 만큼 부딫혀 보면서 이해의 영역을 넓혀나가는게 좋다

    MDN JavaScript 공식
        https://developer.mozilla.org/ko/docs/Web/JavaScript
        https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference

    JavaScript 버젼 참조 : https://www.w3schools.com/js/js_versions.asp
        ES5 : https://www.w3schools.com/js/js_es5.asp
        ES6 : https://www.w3schools.com/js/js_es6.asp


    자바스크립트 구동 환경 = 엔진 + 런타임
        엔진 과 런타임에 따라 ECMAScript 규격 지원하는 내용 범위, 
        제공 객체, 함수들이 다른 부분 존재

    V8 엔진 : 구글에서 개발한 크롬 브라우저용 고성능 JS엔진, 
	    Node.js 의 엔진으로도 사용됨.

    풍부한 라이브러리, 프레임워크..
        jQuery 와 같이 산업표준화된 라이브러리 풍부.
        JSON 데이터 교환 포맷
        다양한 프레임워크 : vue.js, react.js, angular.js 등...
	
        그밖에도 다양한 영역에서 사용됨
            TypeScript : 컴파일 가능한 JS	
            서버사이드 개발 : Node.JS
            하이브리드앱 : IONIC 
            크로스플랫폼앱 :  React Native
            데스크탑 어플리케이션 : electron
            게임 : PhaserJS, ImpactJS
            3D,VR,: three.JS
            AR  : Aframe, AR.js
            머신러닝 : tensorflow.js
            Unity3D 같은 게임개발 엔진에서도 채택


    IE9, IE10  와 같은 구형 브라우저에서는
    ES6 의 let, const 를 사용 못함.

        개발 단계에서는 '바벨' 등을 사용하여
        우리가 개발한 코드가 구형 브라우저 에서동 동작케 함.
*/