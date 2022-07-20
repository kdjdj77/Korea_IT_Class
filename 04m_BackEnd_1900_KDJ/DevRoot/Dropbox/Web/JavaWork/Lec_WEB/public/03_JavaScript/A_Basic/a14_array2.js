// Q1.
{
    const fruits = ['apple', 'banana', 'orange'];
    // 위 배열로부터 다음 문자열을 만들어 출력하세요
    // "apple,banana,orange"

    const result = fruits.join(',');
    console.log(result);
}
  
// Q2.
{
    const fruits = '딸기,키위,바나나,체리';
    // 위 문자열로부터 다음 배열을 만들어 출력하세요
    // [ '딸기', '키위', '바나나', '체리' ]

    const result = fruits.split(',');
    console.log(result);
}
  
// Q3.
{
    const array = [1, 2, 3, 4, 5];
    const result = array.reverse();
    // 역정렬된 배열을 만들어 출력하세요 [ 5, 4, 3, 2, 1 ]
    
    console.log(result);
}
  
// Q4. make new array without the first two elements
{
    const array = [1, 2, 3, 4, 5];
    // 맨 앞의 두개원소가 삭제된 배열을 만들어 출력하세요
    // [ 3, 4, 5 ]

    const result = array.slice(2, 5);  // 원본 변화 없다
    console.log(result);

    array.splice(0, 2);  // 원본 변화 있다
    console.log(array);
}