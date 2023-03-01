const commentBtn = document.querySelector("#commentBtn");
const writer = document.querySelector("#writer");
const contents = document.querySelector("#contents");
const commentList = document.querySelector("#commentList");
const moreBtn = document.querySelector("#moreBtn");
const updateBtn = document.querySelector("#updateBtn");



let page = 1;
const bookNum = commentBtn.getAttribute("data-booknum");

getCommentList(page,bookNum);

commentBtn.addEventListener("click",function(){


 
    let wv=writer.value;
    let cv=contents.value;
    let cg=commentBtn.getAttribute("data-booknum")

    console.log(wv)
    console.log(cv)
    console.log(cg)


// ajax
//1. xmlhttprequest 생성
    const xhttp = new XMLHttpRequest();

//2. url method
    xhttp.open("POST", "./commentAdd");

//3. EncType
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
//4. send 요청발생 (post = 파라미터 전송)
    xhttp.send("writer="+wv+"&contents="+cv+"&bookNum="+cg)
//5. 응답 처리 (event 발생시)
    xhttp.onreadystatechange = function(){
        if(this.readyState==4 && this.status ==200){
            let result = xhttp.responseText.trim();
            console.log(result)
            result= JSON.parse(result);
            writer.value = ""
            contents.value = ""
            if(result.result == 1){
                
                

                for(let i = 0 ; i <commentList.children.length;)
                {
                    commentList.children[0].remove();

                }

                page = 1;
                getCommentList(page,bookNum);

                // if(commentList.children[0].length != 0){
                //     commentList.children[0].remove();
                    

                // }

            }else{
                
            }
        }
    }
})



function getCommentList(p,bn){

    const xhttp = new XMLHttpRequest();

    xhttp.open("GET", "./commentList?page="+p+"&bookNum=" + bn);

    xhttp.send();

    xhttp.addEventListener("readystatechange",function(){
        if(this.status=200 && this.readyState==4){
           //1.jsp 결과물
            // commentList.innerHTML = xhttp.responseText;
            
            //2.json 결과물
            let result = JSON.parse(xhttp.responseText.trim());
            let pager = result.pager;
            let ar = result.list;            
            let tbody = document.createElement("tbody");


            for(let i=0; i<ar.length; i++)
            {
                
                let tr = document.createElement("tr");
                let td = document.createElement("td");
                let writer = document.createTextNode(ar[i].writer);
                let contents = document.createTextNode(ar[i].contents);

                td.appendChild(writer);
                tr.appendChild(td);


                td = document.createElement("td");
                td.appendChild(contents);
                tr.appendChild(td);
                


                

                td = document.createElement("td");
                let tdText = document.createTextNode("수정");
                let tdAttr = document.createAttribute("class");
                tdAttr.value = "update";
                td.setAttributeNode(tdAttr);
                tdAttr = document.createAttribute("data-commentNum");
                tdAttr.value = ar[i].num;
                td.setAttributeNode(tdAttr);

                td.appendChild(tdText);
                tr.appendChild(td);

                td = document.createElement("td");
                tdText = document.createTextNode("삭제");
                tdAttr = document.createAttribute("class");
                tdAttr.value = "delete";
                td.setAttributeNode(tdAttr);
                tdAttr = document.createAttribute("data-commentNum");
                tdAttr.value = ar[i].num;
                td.setAttributeNode(tdAttr);

                td.appendChild(tdText);
                tr.appendChild(td);

               




                commentList.appendChild(tr);

                if(page >= pager.totalPage){
                    moreBtn.classList.add("disabled");
                }else{
                    moreBtn.classList.remove("disabled");
                }

            }
           
            resultAttr = document.createAttribute("class");
            resultAttr.value="table-group-divider";
            commentList.setAttributeNode(resultAttr);
        }






        
    })
}


// 덕복이..


moreBtn.addEventListener("click",function(){

    page ++;
    getCommentList(page, bookNum);
    


})


const commentSector = document.querySelector("#commentSector");

commentList.addEventListener("click",function(event){

    if(event.target.className == "delete"){
        let check = window.confirm("삭제 할거?");
        if(check){

            console.log(event.target.getAttribute("data-commentnum") );
           let number = event.target.getAttribute("data-commentnum");
            
            const xhttp = new XMLHttpRequest();

            xhttp.open("POST","./commentDelete");
            xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

            xhttp.send("num="+number);

            xhttp.onreadystatechange = function(){
                if(xhttp.status==200 && xhttp.readyState ==4){

                    let result = xhttp.responseText.trim();

                    if(result == 1){
                        console.log(" 삭제 진행 ");
                        for(let i = 0 ; i <commentList.children.length;)
                        {
                            commentList.children[0].remove();
    
                        }
    
                        page = 1;
                        getCommentList(page,bookNum);

                    }

                    


                }

            }

        }

        
    }
    
    if(event.target.className == "update"){
        

        // let contents = event.target.previousSibling.previousSibling.previousSibling;
        // console.log(contents);
        // let v = contents.innerHTML;
        let contents = event.target.previousSibling.innerHTML;
        
        let writer = event.target.previousSibling.previousSibling.innerHTML;
        let num = event.target.getAttribute("data-commentNum");
        
        document.querySelector("#updateContents").value = contents;
        document.querySelector("#updateWriter").value = writer;
        document.querySelector("#num").value = num;


        document.querySelector("#up").click();
        

    }



})



updateBtn.addEventListener("click", function(){
    

    let updateNum = document.querySelector("#num").value;
    let updateContents = document.querySelector("#updateContents").value;




    const xhttp = new XMLHttpRequest();

    xhttp.open("POST","./commentUpdate");

    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send("num="+updateNum + "&contents="+updateContents);
    
    xhttp.onreadystatechange = function(){

            if(this.status == 200 && this.readyState == 4){


                let result = xhttp.responseText.trim();

                    if(result == 1){
                        
                        console.log(" 업데이트 진행 ");
                        for(let i = 0 ; i <commentList.children.length;)
                        {
                            commentList.children[0].remove();
    
                        }
    
                        page = 1;
                        getCommentList(page,bookNum);


                    }

            }



    }


})