// const data = [
//     { name: 'Ajay', role: 'developer' },
//     { name: 'Tanya', role: 'coach' },
//     { name: 'John', role: 'developer' }
// ];

// function groupBy(data, key){
//     let groupedData = {};
//     for (let i = 0; i < data.length; i++) {
//         const item = data[i];
//         const keyValue = item[key];
        
//         if (!groupedData[keyValue]) {
//             groupedData[keyValue] = [];
//         }
//         groupedData[keyValue].push(item);
//     }

//     if (Object.keys(groupedData).length === 0){
//         return 'No data found';
//     }

//     return groupedData;
// }

// let role = 'role';  // ✅ Pass the correct key name

// const grouped = groupBy(data, role);
// console.log(grouped);







// const nested = {
//     a: {
//       b: {
//         c: 1
//       }
//     },
//     d: 2
//   };
//   function flattenObject(obj) {
//     const result = {};
//     for(let key in obj) {
//         if (typeof obj[key] === 'object' && !Array.isArray(obj[key])) {
//             const flatObject = flattenObject(obj[key]);
//             for(let innerKey in flatObject) {
//             result[`${key}.${innerKey}`] = flatObject[innerKey];
//             }
//         } else {
//             result[key] = obj[key];
//         }
//     }

//   }
  
//   flattenObject(nested);
//   /*
//   Output:
//   {
//     'a.b.c': 1,
//     'd': 2
//   }
//   */
  






  // const nested = {
  //   a: {
  //     b: {
  //       c: 1
  //     }
  //   },
  //   d: 2
  // };
  
  // function flattenObject(obj) {
  //   const result = {};
    
  //   for (let key in obj) {
  //     if (typeof obj[key] === 'object' && obj[key] !== null && !Array.isArray(obj[key])) {
  //       const flatObject = flattenObject(obj[key]);
  //       for (let innerKey in flatObject) {
  //         result[`${key}.${innerKey}`] = flatObject[innerKey];
  //       }
  //     } else {
  //       result[key] = obj[key];
  //     }
  //   }
  
  //   return result; // ✅ missing in your version
  // }
  
  // const flat = flattenObject(nested);
  // console.log(flat);
  

  //reverse a string
  let a = 'ajay';
  function reverseString(str){
    let reversed = '';
    for (let i = str.length - 1; i>= 0; i--){
      reversed = reversed + str[i];

    }
    return reversed;
  }
console.log(
  reverseString(a));

  //solver without new strin
  function revereWithOutNewString(str){
    let arr = str.split('');
    console.log(arr);
    let left = 0;
    let right = arr.length - 1;
    while (left < right){
      [arr[left], arr[right]] = [arr[right], arr[left]];
      left++;
      right--;
    }
    console.log(arr);
    return arr.join('');
    
  }
console.log(
  revereWithOutNewString(a));


  //check palindrome
  function checkPalidRome(){
    let str = 'madam1';
    let left = 0;
    let right = str.length - 1;
    while(left < right){
      if (str[left] !== str[right]){
        return 'this is not palidrome';
      }
      left++;
      right--;
    }
    return 'this is palidrome';
  }


  console.log(
    checkPalidRome()
  );
