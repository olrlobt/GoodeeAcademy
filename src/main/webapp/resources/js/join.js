const inputUserNameText = document.getElementById("inputUserNameText");
const inputPasswordText = document.getElementById("inputPasswordText");
const inputPasswordCheckText = document.getElementById("inputPasswordCheckText");
const inputJoinText = document.getElementsByClassName("inputJoinText");



const inputUserName = document.getElementById("inputUserName");
const inputPassword = document.getElementById("inputPassword");
const inputPasswordCheck = document.getElementById("inputPasswordCheck");
const inputJoin = document.getElementsByClassName("inputJoin");

const joinFrm = document.getElementById("joinFrm");
const reg = document.getElementsByClassName("reg");
const joinSubmit = document.getElementById("joinSubmit");



joinSubmit.addEventListener("click",function(){
    
    let result = true;
    let errorType = 0;

    for(let i = 0 ; i < reg.length ; i ++ ){
        if(reg[i].value.length == 0){

            errorType = 1;
            result = false;
            break;

        }
    }
    
    if( inputUserNameText.innerText != "" || inputPasswordText.innerText != "" || inputPasswordCheckText.innerText !="" )
    {
        if(errorType != 1) errorType = 2;


        result = false;
    }
    if(result){
        joinFrm.submit();

    }


    switch (errorType){
        case 1 : 
            alert(" 입력 안 된 칸이 있습니다. ");
            break;
        case 2 :
            alert(" 조건을 맞추어 주십시오 ");
            break;


    }

})


function setText(string,funccText,funcc){

    funccText.innerText = string;
   
    if(string == ""){
        console.log("ok");
        funcc.classList.add("is-valid");
        funcc.classList.remove("is-invalid");
    }else{
        console.log("not ok");
        funcc.classList.add("is-invalid");
        funcc.classList.remove("is-valid");
    }

    
}

inputUserName.addEventListener("keyup",function(){
    console.log("ID입력")
    if(inputUserName.value.length < 3){
       
        setText("ID 2글자 이상",inputUserNameText,inputUserName);
        
        
    }else{
        setText("",inputUserNameText,inputUserName);
     
        
    }

})



inputPassword.addEventListener("keyup",function(){
    console.log("PW입력" +inputPassword.value.match(/[a-z]/g))

    let string = "";

    let PWsmall = inputPassword.value.match(/[a-z]/g)
    let PWLarge = inputPassword.value.match(/[A-Z]/g)
    let PWInt = inputPassword.value.match(/[0-9]/g)

    console.log(PWsmall);
    console.log(PWLarge);
    console.log(PWInt);


    if(inputPassword.value.length < 6){
        string = "PW 6글자 이상\n";
    }
    if(PWsmall == null){
        string += "소문자 미포함\n"
    }
    if(PWLarge == null){
        string += "대문자 미포함\n"
    }
    if(PWInt == null){
        string +="숫자 미포함\n"
    }
    
    setText(string,inputPasswordText,inputPassword);
})

inputPasswordCheck.addEventListener("blur",function(){
    console.log("PW check입력")
    if(inputPasswordCheck.value != inputPassword.value ){
       
        setText("PW 동일하지 않음",inputPasswordCheckText,inputPasswordCheck);
    }else{
        setText("",inputPasswordCheckText,inputPasswordCheck);

    }

})


for(let i =0 ; i < inputJoin.length ; i++){

    inputJoin[i].addEventListener("blur", function(){
        console.log(" 기타 입력 ")

        if(inputJoin[i].value.length<1){
            setText("1글자 이상 입력",inputJoinText[i],inputJoin[i]);



        }else{
            setText("",inputJoinText[i],inputJoin[i]);
    
        }


    })

}
