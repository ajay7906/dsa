function armStrong(num) {
    let sum = 0;
    let temp = num;
    const length = String(num).length;
    console.log("Length:", length);

    while (temp > 0) {
        let digit = temp % 10; // extract last digit
        sum += Math.pow(digit, length); // add digit^length
        temp = Math.floor(temp / 10); // remove last digit
    }

    console.log("Sum:", sum, "Original:", num);
    return sum === num;
}

console.log(armStrong(153));  // true
console.log(armStrong(9474)); // true
console.log(armStrong(123));  // false
