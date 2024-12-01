// Input: Bar heights array
const bars = [3, 1, 4, 2, 5];

// Find the maximum height dynamically
const maxHeight = Math.max(...bars);

// Print the bar chart
console.log("Bar Chart:");
for (let i = maxHeight; i > 0; i--) {
    let row = "";
    for (let j = 0; j < bars.length; j++) {
        // Print '*' if the bar height is >= current row, else print space
        if (bars[j] >= i) {
            row += " * ";
        } else {
            row += "   ";
        }
    }
    console.log(row);
}

// Print the base of the bars
let base = "";
for (let j = 0; j < bars.length; j++) {
    base += "---";
}
console.log(base);

// Print the bar heights below the base
let labels = "";
for (let j = 0; j < bars.length; j++) {
    labels += ` ${bars[j]} `;
}
console.log(labels);
