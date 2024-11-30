function doSomething(callback){
    callback(3, 8);
}

function addTwoNumber(a, b){
    console.log(a + b);
    
    
}
//const addNumber  =  addTwoNumber(3, 6);
// doSomething(addTwoNumber); 



function fetchData(success, error){
     const random =  Math.random();
     if(random < 0.5){
         success('Success');
     }else{
         error('Error');
     }
}

fetchData(function(result){
    console.log(result);
}, function(error){
    console.log(error);
})