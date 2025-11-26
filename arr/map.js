// learn the map method
//  I am talking about the set and map
//  Set is a collection of unique values
//  Map is a collection of key-value pairs

// let map = new Map();
// map.set(name: 'John', age: 20, city: 'New York');



// let vehicle = {
//   wheels: "4",
//   fuelType: "Gasoline",
//   color: "Green",
// };
// let carProps = {
//   type: {
//     value: "Volkswagen",
//   },
//   model: {
//     value: "Golf",
//   },
// };

// var car = Object.create(vehicle, carProps);
// console.log('Car', car);




// const car = {
//   brand: "Tesla",
//   showBrand: function() {
//     console.log(this.brand);
//   }
// };

// const speakCar = car.showBrand(); // "Tesla"
// console.log('speakCar', speakCar);


// /**
//  * @param {number[]} nums
//  * @param {number} target
//  * @return {number[]} indices [i, j]
//  */
// function twoSum(nums, target) {
//   const map = new Map(); // value -> index
//   for (let i = 0; i < nums.length; i++) {
//     const need = target - nums[i];
//     if (map.has(need)) {
//       return [map.get(need), i];
//     }
//     // store current number's index (if duplicate values occur, keep first index)
//     if (!map.has(nums[i])) map.set(nums[i], i);
//   }
//   // If problem guarantees a solution, you won't reach here.
//   return null;
// }

// // Example
// console.log(twoSum([2,7,11,15], 9)); // [0, 1]
// console.log(twoSum([3,2,4], 6));     // [1, 2]
// console.log(twoSum([3,3], 6));       // [0, 1]



function printSubarrays(nums) {
  for (let start = 0; start < nums.length; start++) {
    for (let end = start; end < nums.length; end++) {
      const sub = nums.slice(start, end + 1);
      console.log(sub);
    }
  }
}

printSubarrays([4,5,6]);
