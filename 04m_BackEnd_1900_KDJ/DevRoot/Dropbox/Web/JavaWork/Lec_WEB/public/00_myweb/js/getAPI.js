const API_KEY = "J8Trk79a5dDBsVwfEuSXyoNnLG4OHKmZp";
let bData, aData = [];

function getAPI() {
   let url, url2, xhttp;
   url = `https://api.corona-19.kr/korea/country/new/?serviceKey=${API_KEY}`;
   url2 = `https://api.corona-19.kr/korea/beta/?serviceKey=${API_KEY}`;
	xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(this.readyState == 4 && this.status == 200) {
			//데이터 받고 실행할 함수
			let data = JSON.parse(this.responseText);
			bData = data;
			parseJSON1(document.getElementById('countrybox').value);
			setRank1(data);
		}
	};
	xhttp.open("GET", url, true);
	xhttp.send();
	xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(this.readyState == 4 && this.status == 200){
			//데이터 받고 실행할 함수
			let data = JSON.parse(this.responseText);
			aData = data;
			setRank2(data);
			parseJSON2(data);
		}
	}
	xhttp.open("GET", url2, true);
	xhttp.send();
}
//data1/////////////////////////////////////////////////////////////
function parseJSON1(country) {
	document.getElementById('countryName2').innerText = bData[`${country}`]["countryName"] + getDateString();
	document.getElementById('newCase2').innerText = bData[`${country}`]["newCase"];
	document.getElementById('totalCase2').innerText = bData[`${country}`]["totalCase"];
	document.getElementById('recovered2').innerText = bData[`${country}`]["recovered"];
	document.getElementById('death2').innerText = bData[`${country}`]["death"];
}
function setRank1(data) {
	const name = ["seoul","busan","daegu","incheon","gwangju","daejeon","ulsan","sejong",
				"gyeonggi","gangwon","chungbuk","chungnam","jeonbuk","jeonnam","gyeongbuk",
				"gyeongnam","jeju"]
	let len = name.length; let top = ""; let max = 0; let index = 0;
	let loc = []; let count = []; let rankName = []; let rankCount = [];
	for(a of name) {
		loc.push(`${data[`${a}`][`countryName`]}`);
		count.push(`${data[`${a}`][`newCase`]}`);
	}
	//1~5등 구하기
	for (let k = 0; k < 5; k++) {
		for(let i = 0; i < len; i++) {if (max < parseInt(count[i])) {max = count[i]; top = loc[i]; index = i}}
		rankName.push(top);
		rankCount.push(max);
		count[index] = 0;
		max = 0; top = ""; index = 0;
	}
	for(let i = 0; i < 5; i++) {
		document.getElementById(`rank${i + 1}`).innerText = `${i + 1}.  ${rankName[i]}`;
		document.getElementById(`rCount${i + 1}`).innerText = `${rankCount[i]}▲`;
	}
}
//data2/////////////////////////////////////////////////////////////
function parseJSON2(aData){
	document.getElementById('countryName3').innerText = "전국" + getDateString();
	document.getElementById('newCase3').innerText = aData[`korea`]["incDec"]
	document.getElementById('totalCase3').innerText = aData[`korea`]["totalCnt"]
	document.getElementById('recovered3').innerText = aData[`korea`]["recCnt"]
	document.getElementById('death3').innerText = aData[`korea`]["deathCnt"]
}
function setRank2(aData) {
	for(let i = 1; i < 6; i++) {
		document.getElementById(`rankL${i}`).innerText = `${i}. ` + aData['API']['topCountries'][`country${i}N`];
		document.getElementById(`rCountL${i}`).innerText = aData['API']['topCountries'][`country${i}P`] + "%";
	}
}
//////////////////////////////////////////////////////////
function getDateString() {
	let today = new Date();
	let year = today.getFullYear();
	let month = today.getMonth();
	let day = today.getDay();
	year = year - parseInt(year / 100) * 100;
	if (month < 10) month = "0" + month;
	if (day < 10) day = "0" + day;

	return `(${year}/${month}/${day})`;
}
getAPI();