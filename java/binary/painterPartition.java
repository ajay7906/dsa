class PainterPartition {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int k = 2;
        System.out.println(painterPartition(arr, k));
    }

    public static int painterPartition(int[] arr, int k) {

        int start = 0; // max board
        int end = 0;   // sum of boards

        for (int x : arr) {
            start = Math.max(start, x);
            end += x;
        }

        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(arr, k, mid)) {
                result = mid;
                end = mid - 1;   // minimize time
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static boolean isPossible(int[] arr, int k, int maxTime) {
        int painters = 1;
        int wallSum = 0;

        for (int board : arr) {
            if (wallSum + board <= maxTime) {
                wallSum += board;
            } else {
                painters++;
                wallSum = board;

                if (painters > k) {
                    return false;
                }
            }
        }
        return true;
    }
}
