function mapArray(arr, fn){
    return arr.map(fn);
}

const num = [1, 2, 3, 4, 5];
const cube = mapArray(num, (n) => n * n * n);
console.log(cube);