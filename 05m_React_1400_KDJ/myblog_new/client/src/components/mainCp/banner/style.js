import styled from "styled-components";

export const MainBannerTamplate = styled.section`
    background-color: ${function (props) {return props.theme.mainColor;}};
    color: ${function (props) {return props.theme.subColor;}};
    width: 100%;
    height: 20rem;
    display: flex;
    align-content: auto;
    flex-direction: auto;
    flex-wrap: auto;
    justify-content: center;
    align-items: center;

    & > span {
        font-size: 3rem;
    }
`;