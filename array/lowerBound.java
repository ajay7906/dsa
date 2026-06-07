class LowerBound {
    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                left = mid + 1; // Move right
            } else {
                right = mid; // Move left
            }
        }

        return left; // Left is the lower bound index
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 4;
        int index = lowerBound(arr, target);
        System.out.println("Lower bound index for " + target + " is: " + index);
    }
}