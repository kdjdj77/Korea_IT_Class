import styled from "styled-components";

export const PostList = styled.section`
    width: 1080px;
    margin: 0 auto;
    padding: 2rem;

    & .post_box {
        padding: 2rem;
        width: 1080px;
        height: 1080px;
        overflow-y: auto;
        margin: 0 auto;

        ::-webkit-scrollbar {
            width: 0.5rem;
        }

        ::-webkit-scrollbar-thumb {
            height: 30%;
            background-color: ${function(props) {return props.theme.mainColor;}};
        }

        ::-webkit-scrollbar-track {
            background: rgba(33, 122, 244, 0.1);
        }
    }
`;