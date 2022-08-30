
const d1 = document.getElementById("d1");
const d2 = document.getElementById("d2");
const d3 = document.getElementById("d3");
const btn = document.getElementById("btn");
const btn2 = document.getElementById("btn2");
const btn3 = document.getElementById("btn3");




btn.addEventListener("click",f1);
btn2.addEventListener("click",function(){

    alert("btn 2 !!");

});


btn3.addEventListener("click",function(){

    btn2.click();

});

function f1(){
    

    d3.value =  d1.value * d2.value
    
}
