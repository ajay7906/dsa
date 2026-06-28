class RecursionCountDown {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countDown(n));
    }
    public static int countDown(int n) {
        if (n == 1) {
            return 1;
        }
        return n + countDown(n - 1);
    }
}