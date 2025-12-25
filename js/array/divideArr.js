function divideArrayToEqualSum(arr){
    let sum = SumOfArray(arr);
    let n = arr.length;
    let prefixSum = 0;
    for(let i = 0; i < n; i++){
        prefixSum += arr[i];
        let ans = sum - prefixSum;
        if(ans === prefixSum){
            return true;
        }
    }
    return false;
}

function SumOfArray(arr){
    let sum = 0;
    for(let i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    return sum;
}

console.log(divideArrayToEqualSum([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]));
// output: true
// give me ans array which is divided into two equal sum arrays
console.log(divideArrayToEqualSum([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]));