public class BoardPath {
  public static void main(String[] args) {
    int end = 4;
    print(0, end, "");

  }

  public static void print(int curr, int end, String ans) {
    if (curr > end) {
      return;
    }
    if (curr == end) {
      System.out.println(ans);
      return;
    }
    // print(curr + 1, end, ans + 1);
    // print(curr + 2, end, ans + 2);
    // print(curr + 3, end, ans + 3);
    // print(curr + 4, end, ans + 4);
    for (int dice = 1; dice <= 3; dice++) {
      print(curr + dice, end, ans + dice);
    }
  }
}
