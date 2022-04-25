function fibonacci(i:number) {
    if (i==0) {
        return 0;
    }
    if (i==1) {
        return 1;
    }
    return fibonacci(i-1)+ fibonacci(i-2);
}
let i:number = 0;
let sum:number = 0;
console.log("Dãy 10 số Fibonacci là: ")
for (i;i<10;i++){
    console.log("",fibonacci(i));
    sum+=fibonacci(i);
}
console.log("Tổng của 10 số Fibonacci là: "+sum)
