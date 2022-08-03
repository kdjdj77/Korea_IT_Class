const API_KEY = "J8Trk79a5dDBsVwfEuSXyoNnLG4OHKmZp";
let cData = [];

function getAPI() {
   let url, xhttp;
   url = `https://api.corona-19.kr/korea/vaccine/?serviceKey=${API_KEY}`;
	xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(this.readyState == 4 && this.status == 200) {
			//데이터 받고 실행할 함수
			let data = JSON.parse(this.responseText);
         cData = data;
         cData["korea"]["countryNm"] = "전국";
			parseJSON(document.getElementById('countrybox').value);
		}
	};
	xhttp.open("GET", url, true);
	xhttp.send();
}
function parseJSON(country) {
	document.getElementById('countryName').innerText = cData[`${country}`]["countryNm"] + getDateString();
   let pop = 517800;
   const name = {"korea":517800, "seoul":97760,"busan":34290, "daegu":24650, 
               "incheon":29230, "gwangju":15010, "daejeon":15310, "ulsan":11660, 
               "sejong":2756, "gyeonggi":134100, "gangwon":15650, "chungbuk":15790, 
               "chungnam":20600, "jeonbuk":18700, "jeonnam":19020, "gyeongbuk":27000, 
               "gyeongnam":34480, "jeju":6342};
   for(let i = 1; i < 5; i++) {
      let text = cData[`${country}`][`vaccine_${i}`][`vaccine_${i}`];
      let per = Math.round(parseInt(cData[`${country}`][`vaccine_${i}`][`vaccine_${i}`]) / parseInt(name[`${country}`]) * 100) / 100;
      document.getElementById(`vaccine${i}`).innerText = `${text}명`;
      document.getElementById(`percent${i}`).innerText = ` (${per}%)`;

      document.getElementById(`bar${i}`).style.height = `${per}%`;
   }

}
function getDateString() {
	let today = new Date();
	let year = today.getFullYear();
	let month = today.getMonth() + 1;
	let day = today.getDate();
	year = year - parseInt(year / 100) * 100;
	if (month < 10) month = "0" + month;
	if (day < 10) day = "0" + day;

	return `(${year}/${month}/${day})`;
}
getAPI();