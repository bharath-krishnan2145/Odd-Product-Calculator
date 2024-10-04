var m=prompt("enter the first number")
var n=prompt("enter the second number")
if(m>n){
    console.log("product of odd numbers: 1")
    return
}
var product=1;
var  hasodd=false
for(let i=m;i<=n;i++){
    if(i%2!=0){
        product *=i
        hasodd=true
    }
}
if(!hasodd){
    console.log("there is no odd integers")
}
else{
    console.log("the product of odd integer is ",product)
}
    
