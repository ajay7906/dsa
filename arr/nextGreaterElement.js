// function nextGreaterElement(arr){
//     let stack = [];
//     let result = new Array(arr.length).fill(-1);
//     for(let i = 0; i < arr.length; i++){
//         while(stack.length > 0 && arr[stack[stack.length-1]] < arr[i]){
//             result[stack.pop()] = arr[i];
//         }
//         stack.push(i);
//     }
//     return result;
// }
// const printData = nextGreaterElement([4,5,2,10,8]); // 4 -> 5, 5 -> 10, 2 -> 10, 10 -> 8
// console.log(printData);


function nextSmallerElement(arr){
    let stack = [];
    let result = new Array(arr.length).fill(-1);
    for(let i = 0; i < arr.length; i++){
        while(stack.length > 0 && arr[stack[stack.length-1]] > arr[i]){
            console.log(stack.pop() + " -> " + arr[i]);
            result[stack.pop()] = arr[i];
        }
        stack.push(i);
    }
    return result;
}
const printData = nextSmallerElement([4,5,2,10,8]); // 4 -> 5, 5 -> 10, 2 -> 10, 10 -> 8
console.log(printData);






// var nextGreaterElement = function(nums1, nums2) {
//     let stack = [];
//     let map = {}; // value -> next greater
    
//     for (let num of nums2) {
//         while (stack.length && num > stack[stack.length - 1]) {
//             map[stack.pop()] = num;
//         }
//         stack.push(num);
//     }

//     while (stack.length) {
//         map[stack.pop()] = -1;
//     }

//     return nums1.map(num => map[num]);
// };
// const printData = nextGreaterElement([4,1,2], [1,3,4,2]);
// console.log(printData);