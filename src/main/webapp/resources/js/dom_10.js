// const d2 = document.getElementById("d2");
const d2 = document.querySelector("#d2");
const d1 = document.querySelector("#d1");
const d3 = document.querySelector("#d3");
const d4 = document.querySelector("#d4");
d2.addEventListener("mouseenter",function(){

    console.log("Enter")
   // d1.className = "c2"
    d1.classList.replace("c3","c2")

})

d2.addEventListener("mouseleave", function(){


    console.log("Leave")
   

    d1.classList.add("c4");
})

d3.addEventListener("click", function(){

    console.log("toggle")
    d2.classList.toggle("c2")
    
})

d4.addEventListener("click", function(){

    console.log("REQUEST")
    console.log(location.origin)
    console.log(location.host)
    console.log(location.pathname)
    console.log(location.search)

   // location.href = "./dom_9.html";  
    
    
})

