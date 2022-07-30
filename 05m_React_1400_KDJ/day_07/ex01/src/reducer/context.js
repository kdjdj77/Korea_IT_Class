import {createContext, useReducer} from "react";

export const Context = createContext();

const initialState = [
   {
      id: 1,
      name: "김사과",
   },
   {
      id: 2,
      name: "반하나",
   },
   {
      id: 3,
      name: "오렌지",
   },
];

const reducer = function(state, action) {
   switch(action.type) {
      case "ADD_STATE":
         return [...state, {id: action.id, name: action.name}];
      case "REMOVE_STATE":
         return state.filter(function(item) {
            return item.id !== action.id;
         })
      default:
         return state;
   }
}

const ContextProvider = function({children}) {
   const [state, dispatch] = useReducer(reducer, initialState);
   return (
      <Context.Provider value={{state, dispatch}}>
         {children}
      </Context.Provider>
   );
};
export default ContextProvider;