function findThirdMax(num1,num2,num3) {
    if(num1 >=num2 && num1 >=num3){
        return num1;
    }else if(num2 >= num3){
        return num2;
    }else{
        return num3;
    }
}

console.log(findThirdMax(3, 2, 1)); // Output: 2
console.log(findThirdMax(15, 22, 3)); // Output: 15