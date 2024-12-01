function findElement(arr, x){
    const index =  arr.indexOf(x);

    if (index === -1) {
        console.log("Element not found");
        
    }
    else{
        console.log(`Element found at index ${index}`);
    }
}
const array = [56, 89, 45, 89, 56];
const target  = 89;
findElement(array, target);