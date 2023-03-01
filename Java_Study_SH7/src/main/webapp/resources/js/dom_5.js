const d2 = document.getElementById("d2");
const d1 = document.getElementById("d1");
const d3 = document.getElementById("d3");
const d4 = document.getElementById("d4");
const d5 = document.getElementById("d5");
const span1 = document.getElementById("span1");



d2.addEventListener("focus",function(){

    console.log("입력 준비");

});


d2.addEventListener("blur",function(){

    console.log("blur 발생");

});



d1.addEventListener("blur",function(){
    if(d1.value.length < 4){
        d1.focus();

    }
});

d3.addEventListener("change",function(){
    console.log("change 발생");


});

d5.addEventListener("change",function(){
    console.log("change 발생");


});

d4.addEventListener("keyup", function(){

    console.log("key up 발생");
    span1.innerText  =   (d4.value.length * 1000) + "";



});