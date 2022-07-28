const API_KEY = "J8Trk79a5dDBsVwfEuSXyoNnLG4OHKmZp"
let bData = [];
let aData = [];

function loadBData() {
   let url, xhttp;
   url = `https://api.corona-19.kr/korea/country/new/?serviceKey=${API_KEY}`;
   xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(this.readyState == 4 && this.status == 200) {
			bData = JSON.parse(this.responseText);
			//데이터 받고 실행할 함수
			parseJSONb(document.getElementById('countrybox').value);
			setRank();
			console.log(bData);
		}
	};
	xhttp.open("GET", url, true);
	xhttp.send();
}
function parseJSONb(country) {
	document.getElementById('countryName2').innerText = bData[`${country}`]["countryName"]
	document.getElementById('newCase2').innerText = bData[`${country}`]["newCase"]
	document.getElementById('totalCase2').innerText = bData[`${country}`]["totalCase"]
	document.getElementById('recovered2').innerText = bData[`${country}`]["recovered"]
	document.getElementById('death2').innerText = bData[`${country}`]["death"]
}

function setRank() {
	const name = ["seoul","busan","daegu","incheon","gwangju","daejeon","ulsan","sejong",
				"gyeonggi","gangwon","chungbuk","chungnam","jeonbuk","jeonnam","gyeongbuk",
				"gyeongnam","jeju"]
	let len = name.length; let top = ""; let max = 0; let index = 0;
	let loc = []; let count = []; let rankName = []; let rankCount = [];
	for(a of name) {
		loc.push(`${bData[`${a}`][`countryName`]}`);
		count.push(`${bData[`${a}`][`newCase`]}`);
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

loadBData();


/////////////////////////////////////////////////////////////////////////////////////////////////////
const loadAData = function() {
   let url, xhttp;
   url = `https://api.corona-19.kr/korea/beta/?serviceKey=${API_KEY}`;
   xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(this.readyState == 4 && this.status == 200){
			parseJSONa(JSON.parse(this.responseText));
		}
	};
	xhttp.open("GET", url, true);
	xhttp.send();
}
const parseJSONa = function(jsonObj){
	
}