
const addFileBtn = document.getElementById("addFileBtn");
const FileDiv = document.getElementById("FileDiv");
let i = 1;

addFileBtn.addEventListener("click",function(){


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
        let type = document.createAttribute("type");
        let name = document.createAttribute("name");
        let fileNum = document.createTextNode("file" + i);
    
    
        div1.appendChild(lable);
        classs.value = "row mb-3";
        div1.setAttributeNode(classs);

        lable.appendChild(fileNum);
        classs1.value = "col-sm-2";
        lable.setAttributeNode(classs1);
        lable.classList.add("col-form-label");

        div1.appendChild(div2);
        classs2.value = "col-sm-10";
        div2.setAttributeNode(classs2);


        div2.appendChild(input);
        name.value = "files";
        classs3.value = "form-control";
        id.value = "file" + i++;
        type.value = "file"
        input.setAttributeNode(id);
        input.setAttributeNode(type);
        input.setAttributeNode(classs3);
        input.setAttributeNode(name);
    
    
    
    
    
    
        
        FileDiv.append(div1);

    }else{
        alert(" 더 이상 추가할 수 없습니다 ");
    }
    


})