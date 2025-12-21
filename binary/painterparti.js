// painter partioning problem

function painterPartition(arr, n, k){
    let start = Math.max(...arr);
    let end = arr.reduce((acc, curr) => acc + curr, 0);
    let result = -1;
    while(start <= end){
        let mid = start + (end - start) / 2;
        if(isPossible(arr, n, k, mid)){
            result = mid;
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
    }
    return result;
}

function isPossible(arr, n, k, mid){
    let painterCount = 1;
    let wallSum = 0;
    for(let i = 0; i < n; i++){
        if(wallSum + arr[i] <= mid){
            wallSum += arr[i];
        }
        else{
            painterCount++;
            if(painterCount > k || arr[i] > mid){
                return false;
            }
        }
    }
    return true;
}

console.log(painterPartition([10, 20, 30, 40], 4, 2));