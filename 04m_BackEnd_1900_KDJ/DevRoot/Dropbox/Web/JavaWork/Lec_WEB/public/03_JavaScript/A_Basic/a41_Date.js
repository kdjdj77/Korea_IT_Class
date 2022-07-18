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

// TODO


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
// console.log('-'.repeat(20));
// console.log('[Date Output format]');

// arr = [];
// arr.forEach(d => console.log(d));



/* Date Input format
    Date.parse() : string -> millisecond 로 변환
*/
// console.log('-'.repeat(20));
// console.log('[Date Input format]');
// arr = [];
// arr.forEach(d => console.log(d));


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
// console.log('-'.repeat(20));
// console.log('[Date get 메소드]')
// const months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
// const days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

// d = new Date();

// TODO

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
// console.log('-'.repeat(20));
// console.log('[날짜 비교]')

// TODO

console.log("\n[프로그램 종료]", '\n'.repeat(20));














