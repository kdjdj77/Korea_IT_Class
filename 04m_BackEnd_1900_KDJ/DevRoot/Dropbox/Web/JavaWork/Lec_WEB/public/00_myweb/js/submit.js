function submit() {
   let frm = document.forms['survey'];
   const errorText = "을(를) 입력해주세요"
   arrKey = ["team", "rank", "name", "phone", "email", "address"];
   arrName = ["소속", "직급", "이름", "핸드폰번호", "이메일", "주소"];
   if(!frm["team"].value.trim()) {frm["team"].focus();alert("소속" + errorText);return false;}
   let myjson = 
   {
      "team":frm["team"].value,
      "rank":frm["rank"].value,
      "name":frm["name"].value,
      "phone":frm["phone"].value,
      "email":frm["email"].value,
      "address":frm["address"].value,
      "symptom":frm["symptom"].value,
      "feverDate":{
         "year":frm["yearF"].value,
         "mon":frm["monF"].value,
         "day":frm["dayF"].value,
      },
      "symptomDate":{
         "year":frm["year"].value,
         "mon":frm["mon"].value,
         "day":frm["day"].value,
      },
      "place":frm["place"].value,
      "inmate":{
         "TF":frm["inmate"].value,
         "who":frm["who"].value,
      },
      "Period":{
         "year1":frm["yearP1"].value,
         "mon1":frm["monP1"].value,
         "day1":frm["dayP1"].value,
         "year2":frm["yearP2"].value,
         "mon2":frm["monP2"].value,
         "day2":frm["dayP2"].value,
      },
      "note":frm["note"].value,
   }
   let str = JSON.stringify(myjson);

   let result = document.createElement("form");
   result.method = 'GET';
   result.action= "https://www.w3schools.com/action_page.php";
   
   let input = document.createElement("input");
   input.setAttribute("name", "result");
   input.setAttribute("value", str);
   result.appendChild(input);
   document.body.appendChild(result);

   result.submit();
}