"use strict"
let year = document.getElementsByClassName("year");
for (let k = 0; k < year.length; k++) {
   for(let i = 20; i < 23; i++) {
      let option = document.createElement('option');
      option.setAttribute("value", i);
      option.innerText = i;
      year[k].appendChild(option);
   }
}

let mon = document.getElementsByClassName("mon");
for (let k = 0; k < mon.length; k++) {
   for(let i = 1; i < 13; i++) {
      let option = document.createElement('option');
      option.setAttribute("value", i);
      option.innerText = i;
      mon[k].appendChild(option);
   }
}

let day = document.getElementsByClassName("day");
for (let k = 0; k < day.length; k++) {
   for(let i = 1; i < 32; i++) {
      let option = document.createElement('option');
      option.setAttribute("value", i);
      option.innerText = i;
      day[k].appendChild(option);
   }
}