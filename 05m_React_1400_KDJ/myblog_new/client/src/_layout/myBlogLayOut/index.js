import LayOutFooter from "./footer";
import LayOutHeader from "./header";

const MyBlogLayOut = function({ children }) {
   return (
      <>
         <LayOutHeader/>
         {children}
         <LayOutFooter/>
      </>
   )
}
export default MyBlogLayOut;