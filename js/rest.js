const user = { name: "Ajay", age: 25, city: "Moradabad", country: "India" };
const { name, ...rest } = user;

console.log(name); // Output: Ajay
console.log(rest); // Output: { age: 25, city: 'Moradabad', country: 'India' }
