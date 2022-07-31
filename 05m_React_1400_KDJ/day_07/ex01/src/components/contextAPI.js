import {useContext, useEffect, useCallback} from "react";
import {Context, REMOVE_STATE} from "../reducer/context";
import AddState from "./addState";

const ContextAPI = () => {
   const {state, dispatch} = useContext(Context);

   useEffect(function() {
      console.log(state);
   }, [state]);

   const onRemoveClick = useCallback(function(id) {
      dispatch({
         type:REMOVE_STATE,
         id:id,
      });
   }, []);

   return (
      <>
         {state.map(function(v) {
            return (
               <div key={v.id}>
                  {v.id}.{v.name}
                  <button onClick={function() {
                     onRemoveClick(v.id);
                  }}>삭제</button>
               </div>
            );
         })}
            <AddState />
         </>
   );
};
export default ContextAPI;