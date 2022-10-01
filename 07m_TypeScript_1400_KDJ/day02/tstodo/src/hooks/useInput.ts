import { ChangeEventHandler, Dispatch, SetStateAction, useCallback, useState } from "react";

const useInput = (
  initalValue: any = null
): [
  typeof value,
  ChangeEventHandler<HTMLInputElement | HTMLTextAreaElement>,
  Dispatch<SetStateAction<typeof value>>
] => {
  const [value, setter] = useState<any>(initalValue);
  const handler: ChangeEventHandler<HTMLInputElement | HTMLTextAreaElement> = useCallback((e) => {
    setter(e.currentTarget.value);
  }, []);
  return [value, handler, setter];
};
export default useInput;
