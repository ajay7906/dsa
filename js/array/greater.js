// find the all which is strictly greatere then the given value x

function greaterX(arr, x){
    let result = [];
    for (let i = 0; i < arr.length; i++){
        if (arr[i] > x) {
            result.push(arr[i]);
        }
    }

}

let arr = [2,1,4,5,3,8,1];
let x = 3;
let result = greaterX(arr, x);
console.log(result); // [4, 5, 8]
