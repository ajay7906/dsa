public class maxSubarray {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num; // Add the current number to the current sum

            // Update maxSum if currentSum is greater
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If currentSum drops below 0, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
