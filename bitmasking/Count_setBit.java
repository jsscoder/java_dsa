public class Count_setBit {
  public static void main(String[] args) {

    int n = 84;
    System.out.println("_______________-");
    System.out.println(SetBit(n));
    System.out.println("_______________-");
    System.out.println(FastBit(n));
  }

  public static int FastBit(int n) {
    int c = 0;
    while (n > 0) {
      c++;
      // n >>= 1;
      n = (n & (n - 1));
    }
    return c;
  }

  public static int SetBit(int n) {
    int c = 0;
    while (n > 0) {
      if ((n & 1) != 0) {
        c++;
      }
      n >>= 1;

    }
    return c;
  }
}
