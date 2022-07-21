/* 
    브라우저에서 가동되는 JavaScript의 경우 기본적으로 브라우저의 timezone 사용


    https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Date
    https://www.w3schools.com/js/js_dates.asp
    https://www.w3schools.com/jsref/jsref_obj_date.asp
*/

let arr, d, d1, d2, d3;


/* Date 객체 생성

new Date()
new Date(year, month, day, hours, minutes, seconds, milliseconds)
new Date(milliseconds)
new Date(date string)

*/

arr = [
    new Date(), // 현재 날짜+시간 정보를 담은 Date 객체 생성

    // JavaScript 는 month 를 0 ~ 11 까지로 다룬다.
    // 7월 7일을 출력하려면..
    new Date(2022, 6, 7, 10, 38, 32, 0),

    // 실제 해당월의 날짜(day)보다 큰 값이 입력되어도, 에러 없이 overflow 처리됨
    new Date(2018, 5, 35, 10, 33, 30),  // 6월 35일? -> 7월 5일로 출력    

    // 연, 월, 일, 시 분
    new Date(2018, 11, 24, 10, 33),

    // 연, 월, 일, 시
    new Date(2018, 11, 24, 10),
    
    // 연, 월, 일
    new Date(2018, 11, 24),
    
    // 연, 월
    new Date(2018, 11),

    // 그러나, '월' 이 빠지면 안된다.
    // 만약 정수값 하나만 주어지면. 이는 milliseconds 로 처리된다
    // new Date(milliseconds)
    // zero time 은 UTC 1970. 1. 1 00:00:00 이다

    new Date(2018), // ?
    new Date(100000000000),
    new Date(-100000000000),  // 1970.1.1 이전 시간
    new Date(86400000),    // 하루는 86400000ms 이다  -> 1970-01-02T00:00:00.000Z

    // year 에 한자리 혹은 두자리 숫자가 주어지면 19xx 년으로 처리된다
    new Date(99, 11, 24),  // 1999-12-23T15:00:00.000Z
    new Date(9, 11, 24),  // 1909-12-23T15:30:00.000Z

    // dateString 사용  (dateString 은 다음에 소개)
    new Date("October 13, 2014 11:13:00"),    
];
arr.forEach(d => console.log(d));

/* Date Output format

    JS 는 일반적으로 아래 3가지 date input format 이 있다
        ISO Date	"2015-03-25" (The International Standard) ISO8601
        Short Date	"03/25/2015"
        Long Date	"Mar 25 2015" or "25 Mar 2015"

    
    JS 의 Date Output
        "Thu Jul 07 2022 10:54:02 GMT+0900 (한국 표준시)"  (디폴트 포맷)


    세계표준시
    UTC(Universal Time Coordinated) 혹은 GMT(Greenwich Mean Time) 라 한다
*/
console.log('-'.repeat(20));
console.log('[Date Output format]');

arr = [
    // ISO8651 포맷,  실제 생성된 Date 는 timezone 마다 살짝 다를수 있다
    new Date("2015-03-25"),   // YYYY-MM-DD
    new Date("2015-03"),     // YYYY-MM
    new Date("2015"),        // YYYY   (정수가 아닌 string!)
    new Date("2015-03-25T12:00:00Z"),  // YYYY-MM-DDTHH:MM:SSZ    (는 날싸T시간Z  Z는 UTC time 의미 )
    new Date("2015-03-25T12:00:00-06:30"),  // UTC에 상대적인 시간명시하려면 +HH:MM, -HH:MM 을 붙인다
    new Date("2015-3-25"),    // <- 앞의 0 을 빼면, 어떤 브라우저에서는 에러 날수 있다

    // Short Date 포맷
    new Date("03/25/2015"),  // MM/DD/YYYY,
    new Date("2015/03/25"),  // YYYY/MM/DD  포맷에 대한 동작도 브라우저마다 다르다 (예측불허, undeinfe? NaN)
    new Date("25-03-2015"),  // DD-MM-YYYY  이또한 예측 불허  (Node 에선 Invalid Date)

    // Long Date 포맷
    new Date("Mar 25 2015"),  // MMM DD YYYY 
    new Date("25 Mar 2015"),  // month 와 day 는 순서 바뀌어도 무관
    new Date("March 25 2015"),  // month 는 full 로 작성해도 동작
    new Date("JANUARY, 25, 2015"),  // 콤마는 무시되고,  대소문자 구문 안함


];
arr.forEach(d => console.log(d));



/* Date Input format
    Date.parse() : string -> millisecond 로 변환
*/
console.log('-'.repeat(20));
console.log('[Date Input format]');
arr = [
    Date.parse("March 21, 2012"),
    new Date(Date.parse("March 21, 2012")),
];
arr.forEach(d => console.log(d));


/* Date get 메소드들
    getFullYear()	Get the year as a four digit number (yyyy)
    getMonth()	Get the month as a number (0-11)
    getDate()	Get the day as a number (1-31)
    getHours()	Get the hour (0-23)
    getMinutes()	Get the minute (0-59)
    getSeconds()	Get the second (0-59)
    getMilliseconds()	Get the millisecond (0-999)
    getTime()	Get the time (milliseconds since January 1, 1970)
    getDay()	Get the weekday as a number (0-6)
    Date.now()	Get the time. ECMAScript 5.
*/
console.log('-'.repeat(20));
console.log('[Date get 메소드]')
const months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
const days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

d = new Date();

console.log(d.getFullYear() + "/" + 
    (d.getMonth() + 1) + "/" +  // 0 ~ 11
    d.getDate() + " " +
    d.getHours() + ":" + 
    d.getMinutes() + ":" +
    d.getSeconds() + "." +
    d.getMilliseconds()
);

console.log(months[d.getMonth()]);
console.log(d.getDay(), days[d.getDay()]);

/* 
그밖에도 UTC 날짜,시간을 get 하는 메소드들도 있다

getUTCDate()	Same as getDate(), but returns the UTC date
getUTCDay()	Same as getDay(), but returns the UTC day
getUTCFullYear()	Same as getFullYear(), but returns the UTC year
getUTCHours()	Same as getHours(), but returns the UTC hour
getUTCMilliseconds()	Same as getMilliseconds(), but returns the UTC milliseconds
getUTCMinutes()	Same as getMinutes(), but returns the UTC minutes
getUTCMonth()	Same as getMonth(), but returns the UTC month
getUTCSeconds()	Same as getSeconds(), but returns the UTC seconds

*/


/* Date set 메소드들
    Date 객체의 일부 수정하기

    setDate()	Set the day as a number (1-31)
    setFullYear()	Set the year (optionally month and day)
    setHours()	Set the hour (0-23)
    setMilliseconds()	Set the milliseconds (0-999)
    setMinutes()	Set the minutes (0-59)
    setMonth()	Set the month (0-11)
    setSeconds()	Set the seconds (0-59)
    setTime()	Set the time (milliseconds since January 1, 1970)
*/
// console.log('-'.repeat(20));
// console.log('[Date set 메소드]')

// d = new Date();
// TODO


/* 날짜 비교
    Date 객체에 대한 비교연산 가능
*/
console.log('-'.repeat(20));
console.log('[날짜 비교]')

d1 = new Date();
d2 = new Date(2100, 5, 4);
d3 = new Date(1980, 11, 4);

console.log(d1 > d2);
console.log(d1 > d3);

console.log("\n[프로그램 종료]", '\n'.repeat(20));
