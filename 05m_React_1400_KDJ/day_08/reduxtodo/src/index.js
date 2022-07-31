import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';

/*리덕스 설정
https://redux.js.org/ */
import {createStore} from "redux";
import {Provider} from "react-redux";
import rootReducer from "./reducer/_index";

//dev-tools 미들웨어 적용
import {composeWithDevTools} from "redux-devtools-extension";
const store = createStore(rootReducer, composeWithDevTools());

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <Provider store={store}>
        <App />
    </Provider>
);
