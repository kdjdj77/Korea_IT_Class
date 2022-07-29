const API_KEY = "J8Trk79a5dDBsVwfEuSXyoNnLG4OHKmZp";

function getAPI() {
   let url, url2, xhttp;
   url = `https://api.corona-19.kr/korea/country/new/?serviceKey=${API_KEY}`;
   url2 = `https://api.corona-19.kr/korea/beta/?serviceKey=${API_KEY}`;
	xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(this.readyState == 4 && this.status == 200) {
			//데이터 받고 실행할 함수
			let data = JSON.parse(this.responseText);
			parseJSON1(data, document.getElementById('countrybox').value);
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
			setRank2(data);
			parseJSON2(data, JSON.parse(this.responseText));
		}
	}
	xhttp.open("GET", url2, true);
	xhttp.send();
}
//data1/////////////////////////////////////////////////////////////
function parseJSON1(bData, country) {
	document.getElementById('countryName2').innerText = bData[`${country}`]["countryName"]
	document.getElementById('newCase2').innerText = bData[`${country}`]["newCase"]
	document.getElementById('totalCase2').innerText = bData[`${country}`]["totalCase"]
	document.getElementById('recovered2').innerText = bData[`${country}`]["recovered"]
	document.getElementById('death2').innerText = bData[`${country}`]["death"]
}
function setRank1(bData) {
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
//data2/////////////////////////////////////////////////////////////
function parseJSON2(aData, jsonObj){
	
}
function setRank2(aData) {
	for(let i = 1; i < 6; i++) {
		document.getElementById(`rankL${i}`).innerText = `${i}. ` + aData['API']['topCountries'][`country${i}N`];
		document.getElementById(`rCountL${i}`).innerText = aData['API']['topCountries'][`country${i}P`] + "%";
	}
}
getAPI();