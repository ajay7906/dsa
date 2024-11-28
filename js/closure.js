// function Outer(){
//     let count = 0;
//     return function Inner(){
//         count++;
//         console.log(count);
//     }
// }
// const Counter  = Outer();
// Counter();
// console.log(Counter);











function expensiveOperation() {
    const cache = {};
    
    return function(n) {
        if (n in cache) {
            return cache[n];
        }
        console.log("Calculating...");
        const result = n * n * n;
        cache[n] = result;
        return result;
    };
}

const cubedNumber = expensiveOperation();
console.log(cubedNumber(4));  // Calculates
console.log(cubedNumber(4));  // Returns cached result