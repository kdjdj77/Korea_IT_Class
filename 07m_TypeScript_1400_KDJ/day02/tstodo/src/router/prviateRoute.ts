export const Private = "";

// 토큰 로컬 스토리지 저장
// 토큰 값으로 무엇을 판단할 수 있을까?  = 로그인한 사용자다
// 로그인 되어있는 사람만 페이지만 접근
// 로그인 안된 사람은 자동으로 로그인 페이지가 가지도록

/* 
const PrivateRoute = () => {
    const auth = useRef(TokenSerive.getToken(procees.env.REACT_APP_TOEKN_KEY as stirng))
    return auth.current ? <Outlet/> : <Navigate to="/login" />;

    Outlet, Naviate => react-routet-dom


    // <Route element={<PrivatRoute/>}>
        <Route phat="/" element={<TodosPage/>}
    </Route>
}
export default Prviate
*/
