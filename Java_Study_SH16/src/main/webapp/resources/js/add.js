
const addFileBtn = document.getElementById("addFileBtn");
const FileDiv = document.getElementById("FileDiv");
let i = 0;
let idx = 0;


addFileBtn.addEventListener("click",function(){
    i++;

    if(i < 4){
        let div1 = document.createElement("div");
        let div2 = document.createElement("div");
        let lable =  document.createElement("label");
        let input = document.createElement("input");
    
        let id = document.createAttribute("id");
        let classs = document.createAttribute("class");
        let classs1 = document.createAttribute("class");
        let classs2 = document.createAttribute("class");
        let classs3 = document.createAttribute("class");
        let classs4 = document.createAttribute("class");
        let type = document.createAttribute("type");
        let type2 = document.createAttribute("type");
        let name = document.createAttribute("name");
        let fileNum = document.createTextNode("file" + i);
        let buttonText = document.createTextNode("삭제");
    
        let button = document.createElement("button");


    
        
        classs.value = "row mb-3";

        div1.setAttributeNode(classs);

        let id2 = document.createAttribute("id");
        id2.value= "div" + i;
        div1.setAttributeNode(id2); 
        


        classs1.value = "col-sm-2";
        lable.setAttributeNode(classs1);
        lable.classList.add("col-form-label");
        div1.appendChild(lable);
        classs1 = document.createAttribute("id");
        classs1.value = "label" + i;
        lable.setAttributeNode(classs1);

        




        classs2.value = "col-sm-10";
        div2.setAttributeNode(classs2);
        lable.appendChild(fileNum);
        div1.appendChild(div2);
        div2.appendChild(input);
        name.value = "files";
        classs3.value = "form-control";
        id.value = "file" + i;
        type.value = "file"
        input.setAttributeNode(id);
        input.setAttributeNode(type);
        input.setAttributeNode(classs3);
        input.setAttributeNode(name);
    
        
        classs4.value = "del btn btn-danger"
        type2.value = "button"
        button.appendChild(buttonText);
        button.setAttributeNode(type2);
        button.setAttributeNode(classs4);
        classs4 = document.createAttribute("title");
        classs4.value = i;
        button.setAttributeNode(classs4);
        classs4 = document.createAttribute("id");
        classs4.value = "delete" + i;
        button.setAttributeNode(classs4);




        div2.appendChild(button);

        FileDiv.append(div1);

    }else{
        alert(" 더 이상 추가할 수 없습니다 ");
    }
    


})


FileDiv.addEventListener("click",function(event){
    

    if(event.target.classList[0] == "del"){
       
        const num = event.target.title;
        let deleteID = document.getElementById("div"+num);
        console.log("num = " +num);
        console.log("i = " +i);
        FileDiv.removeChild(deleteID);
        
      



        if(num == 1 && i >1){ 



            console.log("1번 파일 삭제");
            let divName = document.getElementById("div2");
            let fileName = document.getElementById("file2");
            let titleName = document.getElementById("delete2");
            let labelName = document.getElementById("label2");

            divName.setAttribute("id","div1");
            fileName.setAttribute("id","file1");
            titleName.setAttribute("id","delete1");
            titleName.setAttribute("title","1");
            labelName.setAttribute("id","label1");
            labelName.innerText = "file1";

            if( i == 3){
                let divName1 = document.getElementById("div3");
                let fileName1 = document.getElementById("file3");
                let titleName1 = document.getElementById("delete3");
                let labelName1 = document.getElementById("label3");
    
                divName1.setAttribute("id","div2");
                fileName1.setAttribute("id","file2");
                titleName1.setAttribute("id","delete2");
                titleName1.setAttribute("title","2");
                labelName1.setAttribute("id","label2");
                labelName1.innerText = "file2";
                /////////////////////////////////////


            }
           

            


        }else if(num == 2 && i == 3){

            let divName1 = document.getElementById("div3");
            let fileName1 = document.getElementById("file3");
            let titleName1 = document.getElementById("delete3");
            let labelName1 = document.getElementById("label3");

            divName1.setAttribute("id","div2");
            fileName1.setAttribute("id","file2");
            titleName1.setAttribute("id","delete2");
            titleName1.setAttribute("title","2");
            labelName1.setAttribute("id","label2");
            labelName1.innerText = "file2";



        }

        i -- ;




       
    }



})