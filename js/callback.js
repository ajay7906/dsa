// function doSomething(callback){
//     callback(3, 8);
// }

// function addTwoNumber(a, b){
//     console.log(a + b);
    
    
// }
// //const addNumber  =  addTwoNumber(3, 6);
// // doSomething(addTwoNumber); 



// function fetchData(success, error){
//      const random =  Math.random();
//      if(random < 0.5){
//          success('Success');
//      }else{
//          error('Error');
//      }
// }

// fetchData(function(result){
//     console.log(result);
// }, function(error){
//     console.log(error);
// })


function findSpan (arr, callback){
    if (arr.length === 0) {
        return callback(new Error('Array is empty'), null);
        
    }
    let max = arr[0];
    let min = arr[0];

    for (let i = 1; i < arr.length; i++){
        if (arr[i] > max) max = arr[i];
        if (arr[i] < min) min =  arr[i];
    }
    const span  =  max - min;
    callback(null, span);
}

const arr = [10, 8, 9, 89, 45];
findSpan(arr, (err, result)=>{
    if (err) {
        console.log(err);
    }else{
        console.log(result);
    }
})