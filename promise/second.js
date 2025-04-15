// const users = [
//     {
//       id: 1,
//       name: "John Smith",
//       email: "john.smith@company.com",
//       active: true,
//       department: "Engineering"
//     },
//     {
//       id: 2,
//       name: "Sarah Johnson",
//       email: "sarah.johnson@company.com",
//       active: true,
//       department: "Marketing"
//     },
//     {
//       id: 3,
//       name: "Michael Chen",
//       email: "michael.chen@company.com",
//       active: false,
//       department: "Finance"
//     },
//     {
//       id: 4,
//       name: "Emma Davis",
//       email: "emma.davis@company.com",
//       active: true,
//       department: "Human Resources"
//     },
//     {
//       id: 5,
//       name: "David Wilson",
//       email: "david.wilson@company.com",
//       active: true,
//       department: "Sales"
//     },
//     {
//       id: 6,
//       name: "Jessica Brown",
//       email: "jessica.brown@company.com",
//       active: false,
//       department: "Customer Support"
//     },
//     {
//       id: 7,
//       name: "Robert Garcia",
//       email: "robert.garcia@company.com",
//       active: false,
//       department: "Engineering"
//     },
//     {
//       id: 8,
//       name: "Lisa Martinez",
//       email: "lisa.martinez@company.com",
//       active: false,
//       department: "Marketing"
//     },
//     {
//       id: 9,
//       name: "Kevin Taylor",
//       email: "kevin.taylor@company.com",
//       active: false,
//       department: "Finance"
//     },
//     {
//       id: 10,
//       name: "Amanda Thomas",
//       email: "amanda.thomas@company.com",
//       active: true,
//       department: "Human Resources"
//     },
//     {
//       id: 11,
//       name: "James Anderson",
//       email: "james.anderson@company.com",
//       active: true,
//       department: "Sales"
//     },
//     {
//       id: 12,
//       name: "Patricia Rodriguez",
//       email: "patricia.rodriguez@company.com",
//       active: false,
//       department: "Customer Support"
//     }
//   ];





// //   Takes an array of user objects and a callback function as arguments

// // Each user object has: {id: number, name: string, email: string, active: boolean, department: string}

// // Returns a Promise that:

// // Processes the data asynchronously

// // Filters out inactive users

// // Groups remaining users by department into an object where keys are department names and values are arrays of users

// // Transforms each user object to only include id, name, and email

// // Calls the callback with the transformed data

// // Resolves with the callback's return value

// // Handles errors appropriately

// function callback(users){
//     const tansformData = users.filter(user => user.active).map(user => {
//         let department = {};
//         if (department.includes(user.department)) {
//             department[user.department].push(user.name);
//         } else if (!department.includes(user.department)) {
//             department[user.department] = [];
//             department[user.department].push(user.name);
           
//         }
     
//        return department;
        
//     });
//     console.log(tansformData);
//     // const groupedData = {};
//     // for (const user of tansformData) {
//     //     const department = user.department;  



    
// }

// function transformObject(users, callback){
//     callback(users);
//     // console.log(users);
// }
// transformObject(users, callback)  






























function sumNumbersIterative(){
    
}




const data = {
    a: 1,
    b: { c: 2, d: { e: 3 } },
    f: [4, { g: 5 }]
  };
  
  console.log(sumNumbersIterative(data)); // Output: 15