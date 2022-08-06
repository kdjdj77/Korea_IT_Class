import { createGlobalStyle } from "styled-components";
const GlobalStyle = createGlobalStyle`
   * {
      margin: 0;
      padding: 0;
      font: inherit;
      color: inherit;
      font-family: "appleM";
   }
   *,
   :after,
   :before {
      box-sizing: border-box;
      flex-shrink: 0;
   }
   :root {
      -webkit-tap-highlight-color: transparent;
      -webkit-text-size-adjust: 100%;
      text-size-adjust: 100%;
      cursor: default;
      line-height: 1.5;
      overflow-wrap: break-word;
      -moz-tab-size: 4;
      tab-size: 4;
      --myblog--main--color: #00c7ae;
      --myblog--sub--color: #ffffff;
   }
   html,
   body {
      height: 100%;
   }
   img,
   picture,
   video,
   canvas,
   svg {
      display: block;
      max-width: 100%;
   }
   button {
      background: none;
      border: 0;
      cursor: pointer;
   }
   a {
      text-decoration: none;
   }
   table {
      border-collapse: collapse;
      border-spacing: 0;
   }
   ul {
      list-style: none;
   }

   body::-webkit-scrollbar {
      display: none;
   }
`;
export default GlobalStyle;