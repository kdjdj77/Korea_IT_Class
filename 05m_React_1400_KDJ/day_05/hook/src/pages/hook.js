import State from '../components/state';
import Memo from '../components/memo';
import Callback from '../components/callback';
import Effect from '../components/effect'
const Hook = function() {
   return (
      <>
         <State/>
         <Memo/>
         <Callback/>
         <Effect/>
      </>
   );
};
export default Hook;