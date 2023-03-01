const count = document.getElementById("count");
const btn = document.getElementById("btn");
const result = document.getElementById("result");
const c1 = document.getElementsByClassName("c1");
const d1 = document.getElementById("d1")
const d1_1 = document.getElementById("d1_1")
const d1_1_1 = document.getElementById("d1_1_1")
const google = document.getElementById("google");


google.addEventListener("click",function(event){
    alert("go google");
    event.preventDefault();
})


d1.addEventListener("click",function(event){
    console.log("d1 click:" )
    console.log(event);
    console.log(event.currentTarget)
    console.log(event.target)

    if(event.target.className == 'buttons'){
        alert("button");
        console.log('this = ' + this);
        console.log(event.target.innerHTML);

    }

},false)



//----------------------
result.addEventListener("click",function(event){
    if(event.target.className == 'c1')
    {
        alert(event.target.innerHTML);
        


    }

})


btn.addEventListener("click",function(){

    console.log(count.value);
    let ct = 0;
    

    for(let i=0;i<count.value;i++){
        let button = document.createElement("button");    
        let button_class = document.createAttribute("class");
        
        button_class.value = "c1";

        button.setAttributeNode(button_class);

        
        button.innerHTML = "CLICK"+ct;

        result.appendChild(button);
        
        ct++;
        
    }
})

