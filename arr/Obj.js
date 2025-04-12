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
  






  const nested = {
    a: {
      b: {
        c: 1
      }
    },
    d: 2
  };
  
  function flattenObject(obj) {
    const result = {};
    
    for (let key in obj) {
      if (typeof obj[key] === 'object' && obj[key] !== null && !Array.isArray(obj[key])) {
        const flatObject = flattenObject(obj[key]);
        for (let innerKey in flatObject) {
          result[`${key}.${innerKey}`] = flatObject[innerKey];
        }
      } else {
        result[key] = obj[key];
      }
    }
  
    return result; // ✅ missing in your version
  }
  
  const flat = flattenObject(nested);
  console.log(flat);
  