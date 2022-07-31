/*
index는 폴더까지만 경로로 가져와도 기본 경로로 읽는다
   import from /reducer
_index는 읽지 못해서 명시해 주어야 한다
   import from /reducer/_index      */

import {combineReducers} from "redux";
import todo from "./todo";

const rootReducer = combineReducers({
   /*합칠 리듀서 목록*/
   todo,
});
export default rootReducer;