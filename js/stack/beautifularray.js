function makeArrayBeautiful(arr) {
    let stack = [];

    for (let num of arr) {
        // If stack has elements & last number has opposite sign, remove it
        if (stack.length > 0 && (stack[stack.length - 1] >= 0) !== (num >= 0)) {
            stack.pop(); // Remove last number
        } else {
            stack.push(num); // Add current number
        }
    }

    return stack;
}

// Example:
console.log(makeArrayBeautiful([4, -3, 2, -5, 6])); // Output: [6]
console.log(makeArrayBeautiful([-1, 2, -3, 4, -5, 6])); // Output: [6]
