public class Sum {
  public static void main(String[] args) {
    int n = 4;
    System.out.println(sumNos(n));
  }

  public static int sumNos(int n) {
    if (n == 0) {
      return 0;
    }
    int prevSum = sumNos(n - 1);
    return n + prevSum;
  }
}
