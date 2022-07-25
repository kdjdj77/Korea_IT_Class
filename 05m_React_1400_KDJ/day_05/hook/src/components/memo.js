import {useMemo, useState} from "react";

const Memo = function() {
   const [color, setColor] = useState("red");
   const [text, setText] = useState("");

   const getColor = useMemo(function() {
      return console.log(`색은 ${color} 입니다`);
   }, [color]);
   /*
   useMemo, useCallback, useEffect의 [] 값을 의존성 배열이라고 한다
   해당 배열에 들어간 값이 바뀌었을 때만 해당 함수의    
   */
   const getText = useMemo(function() {
      return console.log(`텍스트는 실행하지 않습니다`);
   }, [color]);
   /*
   useMemo에는 함수를 잘 담지 않고 값이 바로 선언되기 때문에
   변수인 값을 담는다
   즉, 해당 값이 의존성 배열에 있는 값이 바뀌어야만 렌더링 시 
   재호출되기 때문에 [메모이제이션]을 실현할 수 있다
   */
   const onChangeColor = function() {
      if (color ==="red") setColor("blue")
      else setColor("red")
   };

   return(
      <>
         <div>Memo</div>
         <input type="text" readOnly value={color} style={{color}}/>
         <button onClick={onChangeColor}>변경</button>
      </>
   );
};
export default Memo;