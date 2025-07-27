public class Subsequence {

  public static void main(String[] args) {

    String str = "abc";
   // System.out.println(print(str));'
   System.out.println("_________________");
   print(str);
  }

  public static void print(String str) {
    int n = str.length();
    for (int i = 0; i < (1 << n); i++) {
      Pattern(i, str);
    }

  }

  private static void Pattern(int i, String str) {
    int idx = 0;
    String ans = "";
    while (i > 0) {
      if ((i & 1) != 0) {
        ans = ans + str.charAt(idx);
      }
      idx++;
      i >>= 1;
    }
    System.out.println(ans);
  }
}
