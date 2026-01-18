// // I will write the traoing rainwater problem from brute force to optimal solution
// // Brute force solution
// function trapRainwater(heights){

//     let totalWater = 0;
//     for(let i = 0; i < heights.length; i++){
//         let leftMax = 0;
//         let rightMax = 0;
//         for(let j = 0; j < i; j++){
//             leftMax = Math.max(leftMax, heights[j]);
//         }
//         for(let j = i + 1; j < heights.length; j++){
//             rightMax = Math.max(rightMax, heights[j]);
//         }
//        const waterLevel = Math.min(leftMax, rightMax);
//        if(waterLevel > heights[i]){
//         totalWater += waterLevel - heights[i];
//        }
//     }
//     return totalWater;
// }

// const heights = [0,1,0,2,1,0,1,3,2,1,2,1]
// const result = trapRainwater(heights);
// console.log(result);
// output: 6
// Time complexity: O(n^2)
// Space complexity: O(1)

// better solution using subfix and prefix array
// function trapRainwater(heights){
//     let n = heights.length;
//     let leftMax = new Array(n);
//     let rightMax = new Array(n);
//     leftMax[0] = heights[0];
//     let totalWater = 0; 
//     for(let i = 1; i < n; i++){
//         leftMax[i] = Math.max(leftMax[i-1], heights[i]);
//     }
//     rightMax[n-1] = heights[n-1];
//     for(let i = n-2; i >= 0; i--){
//         rightMax[i] = Math.max(rightMax[i+1], heights[i]);
//     }
//     for(let i = 0; i < n; i++){
//        totalWater += Math.min(leftMax[i], rightMax[i]) - heights[i];
//     }
//     return totalWater;
// }
// const heights = [0,1,0,2,1,0,1,3,2,1,2,1]
// const result = trapRainwater(heights);
// console.log(result);
// output: 6
// Time complexity: O(n)
// Space complexity: O(n)


// optimal solution using two pointers
function trapRainwater(heights){
    let n = heights.length;
    let left = 0;
    let right = n-1;
    let leftMax = 0;
    let rightMax = 0;
    let totalWater = 0;
    while(left < right){
        // const heights = [0,1,0,2,1,0,1,3,2,1,2,1]
        if(heights[left] < heights[right]){
            if(heights[left] > leftMax){
                leftMax = heights[left];
            }else{
                totalWater += leftMax - heights[left];
            }
            left++;
        }else{
            if(heights[right] > rightMax){
                rightMax = heights[right];
            }else{
                totalWater += rightMax - heights[right];
            }   
            right--;
        }
    }
    return totalWater;
}
const heights = [0,1,0,2,1,0,1,3,2,1,2,1]
const result = trapRainwater(heights);
console.log(result);
// output: 6
// Time complexity: O(n)
// Space complexity: O(1)