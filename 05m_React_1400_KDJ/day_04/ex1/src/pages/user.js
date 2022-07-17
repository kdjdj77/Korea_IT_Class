import Hello from "../components/hello";

const User = function() {
   const user = "오렌지";
   const isLover = true;
   const color = "red";

   return(
      <>
         <Hello name="오렌지"/>
         <Hello name="반하나" color="yellow"/>
         <Hello name={user} color={color} isLover={isLover}/>
      </>
   );
};
export default User;