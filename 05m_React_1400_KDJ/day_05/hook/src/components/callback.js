import {useCallback, useState} from "react";

const Callback = function() {
   const [color, setColor] = useState("red");

   const onChangeColor = useCallback(function() {
      if (color ==="red") setColor("blue")
      else setColor("red")
   }, [color]);

   return(
      <>
         <div>useCallback</div>
         <input type="text" readOnly value={color} style={{color}}/>
         <button onClick={onChangeColor}>확인</button>
      </>
   );
}
export default Callback;