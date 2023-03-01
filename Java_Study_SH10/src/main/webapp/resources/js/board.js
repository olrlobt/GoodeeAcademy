
const joinCheck = document.getElementsByClassName("joinCheck");
const joinAllCheck = document.getElementById("joinAllCheck");
const joinCheckSubmit = document.getElementById("joinCheckSubmit");



joinAllCheck.addEventListener("click",function(){

    for(let i = 0 ; i < joinCheck.length ; i ++){
        joinCheck[i].checked = joinAllCheck.checked;


    }

    
    allCheck(joinAllCheck.checked);
  
})



for(let i = 0 ; i < joinCheck.length ; i ++){

    joinCheck[i].addEventListener("click", check);


}

function check(){

    let result = true;

    for(let i = 0 ; i < joinCheck.length ; i ++){

        if(!joinCheck[i].checked){

            result = false;

        }
       
    }

    joinAllCheck.checked = result;

    allCheck(result);


}


function allCheck(result){

    if(result == true){
        joinCheckSubmit.disabled = false;

    }else{

        joinCheckSubmit.disabled = true;

    }


}