import { FooterWrapper, FooterTamplate, FooterTxt, FooterRight } from "./style";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faInstagram, faYoutube } from "@fortawesome/free-brands-svg-icons";

const LayOutFooter = function() {
   return (
      <>
         <FooterWrapper>
            <FooterTamplate>
               <FooterTxt>
                  <p>
                     DaeJin Kim Group<br />
                     (우) 00000 서울시 용산구 이태원 어딘가 찾아보세요
                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                     010.1234.1234 korpg95274@gmail.com<br /><br />
                     Copyright 2022. KDJ©, Ltd. All rights reserved.
                  </p>
               </FooterTxt>
               <FooterRight>
                  <ul>
                     <li>
                        GO ! <span> KDJ SNS </span>
                     </li>
                     <li>
                        <FontAwesomeIcon icon={faInstagram}/>
                     </li>
                     <li>
                        <FontAwesomeIcon icon={faYoutube}/>
                     </li>
                  </ul>
               </FooterRight>
            </FooterTamplate>
         </FooterWrapper>
      </>
   );
};
export default LayOutFooter;