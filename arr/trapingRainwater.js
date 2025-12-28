// I will write the traoing rainwater problem from brute force to optimal solution
// Brute force solution
function trapRainwater(heights){

    let totalWater = 0;
    for(let i = 0; i < heights.length; i++){
        let leftMax = 0;
        let rightMax = 0;
        for(let j = 0; j < i; j++){
            leftMax = Math.max(leftMax, heights[j]);
        }
        for(let j = i + 1; j < heights.length; j++){
            rightMax = Math.max(rightMax, heights[j]);
        }
       const waterLevel = Math.min(leftMax, rightMax);
       if(waterLevel > heights[i]){
        totalWater += waterLevel - heights[i];
       }
    }
    return totalWater;
}

const heights = [0,1,0,2,1,0,1,3,2,1,2,1]
const result = trapRainwater(heights);
console.log(result);
// output: 6