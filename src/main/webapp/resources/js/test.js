
alert("hello");




var num = 1;
let num2 = '1';
console.log(num == num2);
console.log(num === num2);

for(let i=0 ; i<10 ; i++){

    console.log(i);

}

console.log('=======================');

let ar = [1,'2',3.12,true];
console.log(ar[1]);
console.log(ar[2]);
console.log(ar);
console.log();

console.log('=======================');

ar.forEach(function(v,i,ar){
    console.log( i +" == " + v);


});






