//next greate element usign stack
//function for the next greatest element in o(n) time complexity
function nextGreaterElement(arr){
    let stack = [];
    for(let i=0;  i<arr.length; i++){
        while(stack.length>0 && stack[stack.length-1]<arr[i]){
            console.log(stack.pop() + " -> " + arr[i]);
        }
        stack.push(arr[i]);
    }
}
nextGreaterElement([4,5,2,10,8]); // 4 -> 5, 5 -> 10, 2 -> 10, 10 -> 8