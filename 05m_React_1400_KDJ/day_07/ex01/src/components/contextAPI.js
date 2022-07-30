import {useContext, useEffect} from "react";
import {Context} from "../reducer/context";
import AddState from "./addState";

const ContextAPI = () => {
   const {state, dispatch} = useContext(Context);

   useEffect(function() {
      console.log(state);
   }, [state]);

   //TODO AddState처럼 만들기

   return (
       <>
           <div>
               <button>삭제</button>
           </div>
           <AddState />
       </>
   );
};
export default ContextAPI;