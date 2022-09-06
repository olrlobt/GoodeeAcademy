const d1 = document.querySelector("#d1");
const d2 = document.querySelector("#d2");
const result = document.querySelector("#result");



d1.addEventListener("click",function(){

    console.log("gi")

    //1. ajax로 요청하는 객체 생성
    let xhttp = new XMLHttpRequest();
    let v = d2.value;
    //2. 요청할때 필요한 정보  url + GET/POST ;
    xhttp.open("GET", "https://jsonplaceholder.typicode.com/posts/" + v);

    //3. 요청 발생

    xhttp.send();
    //4. 응답 결고 처리
    xhttp.onreadystatechange = function(){
        // //this = http 객체 = xhttp
        // console.log(this.status);
        // console.log(this.readyState);
        // console.log("---------------------------------");

       
        if(this.readyState == 4 && this.status == 200) {
            //console.log(this.responseText);
            let response = this.responseText.trim();
            response = JSON.parse(response);
            

            // console.log(response.userId);
            // console.log(response.id);
            // console.log(response.title);
            // console.log(response.body);

            result.innerHTML = "";
            let h3 = document.createElement("h3");
            let textv = document.createTextNode(response.title);
            h3.appendChild(textv);
            result.append(h3);

            h3 = document.createElement("h3");
            textv = document.createTextNode(response.body);
            h3.appendChild(textv);
            result.append(h3);
            

        }



    }


    console.log("AJAX 발생")


})