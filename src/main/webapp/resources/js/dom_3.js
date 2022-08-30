
const d1 = document.getElementById("d1");
const d2 = document.getElementById("d2");
const btn1 = document.getElementById("btn1");
d1.innerHTML= "hello";



function test2(num1,num2){

let result  = num1 + num2 +num2

    return result;


}

function test(){


    alert("CLICK EVEVNT 실행");
    let result =test2(1,2);
    console.log(result);
    f1();
}

let f1 = function () {
    console.log("익명함수 실행 ");
    
}

d2.onclick = function(){

    console.log("d2 클릭");
}

//btn1.addEventListener("click",f1)
btn1.addEventListener("click",function(){ console.log("check ")})

