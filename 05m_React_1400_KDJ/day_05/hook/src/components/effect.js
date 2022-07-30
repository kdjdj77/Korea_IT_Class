import {useCallback, useEffect, useState} from "react";
const Effect = function() {

   const [color, setColor] = useState("red");

   const onChangeColor = useCallback(function() {
      if (color ==="red") setColor("blue")
      else setColor("red")
   }, [color]);

   useEffect(function() {
      if (color) console.log("페이지가 열렸습니다");
   }, [])

   useEffect(function() {
      if (color) console.log("색이 변경되었습니다");
   }, [color])

   return (
      <>
         <div>Effect</div>
         <input type="text" readOnly value={color} style={{color}}/>
         <button onClick={onChangeColor}>변경</button>
      </>
   );
};
export default Effect;