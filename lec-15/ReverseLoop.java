public class ReverseLoop {
  public static void main(String[] args) {
    int n = 5;
    PD(n);
  }

  public static void PD(int n) {

    if (n == 0) {
      return;
    }
    PD(n - 1);
    System.out.println(n);

  }
}
