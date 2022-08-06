import { PostList } from "./style";

const PostBox = function({ children }) {
   /*
      <상위컴포넌트>
         <하위컴포넌트 />
         <하위컴포넌트 />
         <하위컴포넌트 />
      </상위컴포넌트>
      
      하위 컴포넌트가 상위 컴포넌트에 children이라는 이름으로 props 전달
   */
   return (
      <PostList>
         <p>☀️ 오늘은, 내 친구들에게 어떤 일들이 있어났을까요?</p>
         <div className="post_box">{children}</div>
      </PostList>
   );
};
export default PostBox;