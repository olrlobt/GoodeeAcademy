console.log('dom_1');

let result=window.confirm("홧인");
console.log('result',result);

result = window.prompt("what ur name ?");
console.log('result', result);

let d1=window.document.getElementById("d1");

// alert(d1);
// console.log(d1);
// d1.innerText = result;

let d2 = document.getElementById("d2");

console.log(d2.innerHTML);
console.log(d2.innerText);

let d3 = document.getElementById("d3");
let d4 = document.getElementById("d4");

d4.innerHTML = d3.innerHTML;

