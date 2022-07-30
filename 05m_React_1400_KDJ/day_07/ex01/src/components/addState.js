import { useState} from "react";

const AddState = () => {
    const [name, setName] = useState("");
    const onChangeInput = (e) => {
        setName(e.target.value);
    };

    return (
        <>
            <input
                type="text"
                placeholder="이름을 입력하세요"
                value={name}
                onChange={onChangeInput}
            />
            <button>추가</button>
            <button>초기화</button>
        </>
    );
};
export default AddState;