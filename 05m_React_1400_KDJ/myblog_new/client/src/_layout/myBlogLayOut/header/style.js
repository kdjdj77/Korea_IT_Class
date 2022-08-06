import styled from "styled-components";
export const HeaderWrapper = styled.header`
    width: 100%;
    height: 4rem;
    padding: 1rem;
`;

export const HeaderLogo = styled.div`
    float: left;
    margin-left: 3rem;
    font-weight: bold;
    color: ${function(props) {return props.theme.mainColor;}};
    font-size: 1.5rem;
    cursor: pointer;
`;

export const HeaderList = styled.ul`
    display: flex;
    align-content: auto;
    flex-direction: auto;
    flex-wrap: auto;
    float: right;
    margin-right: 3rem;
    color: ${function(props) {return props.theme.mainColor;}};
    position: relative;
    align-items: center;
    height: 2.5rem;
    font-size: 0.825rem;

    & > li {
        cursor: pointer;

        ::after {
            content: "|";
            clear: both;
            margin: 0 0.5rem;
        }

        :last-child::after {
            content: "";
        }
    }
`;