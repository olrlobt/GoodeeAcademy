const loginForm = document.getElementById("loginForm");
const loginBtn = document.getElementById("loginBtn");
const loginID = document.getElementById("loginID");
const loginPW = document.getElementById("loginPW");




loginBtn.addEventListener("click",function(){


   
    if(loginID.value == ""){
        console.log("no ID");
        alert("ID 를 입력하세요")


    }else if(loginPW.value == "") {
        console.log("no PW");
        alert("PW 를 입력하세요")

    }else{
        loginForm.submit();
        
    }


});