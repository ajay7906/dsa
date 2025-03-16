function nextSmallerElement(arr){
    let stack = [];
    let n = arr.length;
    let result = new Array(n).fill(-1);
    for(let i=0; i<n; i++){
        while(stack.length>0 && arr[stack[stack.length-1]]>arr[i]){
            result[stack.pop()] = arr[i];
        }
        if(stack.length>0){
            result[i] = arr[stack[stack.length-1]];
        }
        stack.push(i);
    }
    return result;
}

const printData = nextSmallerElement([4,5,2,10,8]); // -1, 4, -1, 2, 2
console.log(printData); // [ -1, 4, -1, 2, 2 ]