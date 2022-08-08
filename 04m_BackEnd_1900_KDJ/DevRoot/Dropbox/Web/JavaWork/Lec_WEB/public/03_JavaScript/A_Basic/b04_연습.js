// 주어진 배열의 데이터를 '제곱' 한뒤
// 3의 배수만 골라서 그 합을 구하세요

// [1, 2, 3, 4, 5, 6, 7]
//         제곱
// [1, 4, 9, 16, 25, 36, 49]
//        3의배수
// [      9,         36    ]
//           합
//           45

const data = [1, 2, 3, 4, 5, 6, 7];
Object.freeze(data);   // 원본 변화 시키지 말기

const countedSum = function(arr){

    return arr.map(n => n ** 2)
        .filter(n => n % 3 == 0)
        .reduce((a, b) => a + b)

}

console.log(countedSum(data));
console.log("\n[프로그램 종료]", '\n'.repeat(20));

