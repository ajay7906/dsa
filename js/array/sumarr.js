const array1 = [1, 2, 3];
        const array2 = [4, 5, 6, 7, 8];

        // Find the size of the larger array
        const maxSize = Math.max(array1.length, array2.length);

        // Create a result array to store the sum
        const result = [];

        // Perform element-wise addition
        for (let i = 0; i < maxSize; i++) {
            const val1 = i < array1.length ? array1[i] : 0; // Default to 0 if array1 is smaller
            const val2 = i < array2.length ? array2[i] : 0; // Default to 0 if array2 is smaller
            result.push(val1 + val2);
        }