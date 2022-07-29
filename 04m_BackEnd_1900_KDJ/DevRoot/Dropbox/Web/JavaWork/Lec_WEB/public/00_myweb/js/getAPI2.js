//const API_KEY = "J8Trk79a5dDBsVwfEuSXyoNnLG4OHKmZp"
let aData = [];

function loadAData() {
   let url, xhttp;
   url = `https://api.corona-19.kr/korea/beta/?serviceKey=${API_KEY}`;
   xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(this.readyState == 4 && this.status == 200){
			aData = JSON.parse(this.responseText);
         console.log(aData);
			setRanka();
			parseJSONa(JSON.parse(this.responseText));
		}
	};
	xhttp.open("GET", url, true);
	xhttp.send();
}
const parseJSONa = function(jsonObj){
	
}
function setRanka() {
	for(let i = 1; i < 6; i++) {
		document.getElementById[`rankL${i}`] = aData['API']['topCountries'][`country${i}N`];
		document.getElementById[`rCountL${i}`] = aData['API']['topCountries'][`country${i}P`];
	}
}
loadAData();