const d1 = document.querySelector("#d1");



console.log(d1.childNodes);
console.log(d1.childNodes[3].innerHTML);



console.log(d1.childNodes[3].childNodes[1].childNodes[1].innerHTML);



d1.addEventListener("click",function(){

    // li 모두 삭제

    console.log(d1.children[1].children[0].children);

    let li = d1.children[1].children[0].children;
    let ul = d1.children[1].children[0];
    
    for(let i = 0 ; i < li.length ;){
        li[i].remove();
    }
})