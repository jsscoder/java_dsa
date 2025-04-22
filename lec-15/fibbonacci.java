public class fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibbo(5));
    }

    public static int fibbo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibbo(n - 1) + fibbo(n - 2);
    }
}
