
const remove1 = document.getElementById("remove1");
const remove2 = document.getElementById("remove2");
const remove3 = document.getElementById("remove3");

const d1 = document.getElementById("d1");

const d2class = document.getElementsByClassName("d2class");



remove1.addEventListener("click",function(){

    d1.remove();

})
remove2.addEventListener("click",function(){
    let i = 0;
    if(i < d2class.length ){
        console.log(d2class.length);
        d2.removeChild(d2class[i]);
   
    }
})

remove3.addEventListener("click",function(){
    
    for(let i = 0 ;i < d2class.length; ){
        console.log(d2class.length);
        d2.removeChild(d2class[i]);
   
    }
})

