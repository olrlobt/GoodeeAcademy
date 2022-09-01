const btn = document.getElementById("btn");
const d1 = document.getElementById("d1");
const list1 = document.getElementById("list1");
const add1 = document.getElementById("add1");
const list2 = document.getElementById("list2");
const list3 = document.getElementById("list3");
const add2 = document.getElementById("add2");
const d2 = document.getElementById("d2");
const d3  = document.getElementById("d3");
const add3 = document.getElementById("add3");
const add4 = document.getElementById("add4");

btn.addEventListener("click",function(){
    d1.innerHTML='<img src ="/resources/images/chunsik.png"> '




})

add1.addEventListener("click",function(){
    let li = document.createElement("li");
    let t = document.createTextNode("TEst");
    li.appendChild(t);


    list1.append(li);



})


add2.addEventListener("click",function(){
    let li = document.createElement("li");
    list2.prepend(li);



})

add3.addEventListener("click",function(){

    let input = document.createElement("input");
    let ch = document.createAttribute("type");
    ch.value = "checkbox";
    input.setAttributeNode(ch);
    d2.appendChild(input);



})

add4.addEventListener("click",function(){

    let h = document.createElement("h3"); // h3 태그
    let t = document.createTextNode("before"); // 글자 before
    h.appendChild(t); // h3 자식으로 t를 넣자
    d3.before(h);



})