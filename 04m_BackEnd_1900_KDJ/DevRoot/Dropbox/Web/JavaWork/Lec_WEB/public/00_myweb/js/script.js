const API_KEY = "J8Trk79a5dDBsVwfEuSXyoNnLG4OHKmZp"

const loadBData = function() {
   let url, xhttp;
   url = `https://api.corona-19.kr/korea/country/new/?serviceKey=${API_KEY}`;
   xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(this.readyState == 4 && this.status == 200){
			parseJSONb(JSON.parse(this.responseText));
		}
	};
	xhttp.open("GET", url, true);
	xhttp.send();
}
const parseJSONb = function(jsonObj){
	bData = [];
   for(data of jsonObj) {
      
   }
}
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