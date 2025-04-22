
public class CountSubsequence {

  public static void main(String[] args) {
    String ques = "abc";
    System.out.println("\n" + printSubsequence(ques, ""));

    // System.out.println(c);

  }
  // static int c = 0;

  // public static void print(String ques, String ans) {
  // if (ques.length() == 0) {
  // System.out.println(ans + "");
  // c++;

  // return;
  // }
  // char ch = ques.charAt(0);
  // print(ques.substring(1), ans); // no
  // print(ques.substring(1), ans + ch); // yes

  // }

  public static int printSubsequence(String ques, String ans) {
    if (ques.length() == 0) {
      System.out.println(ans + "");
      // c++;

      return 1;
    }
    char ch = ques.charAt(0);
    int x = printSubsequence(ques.substring(1), ans); // no
    int y = printSubsequence(ques.substring(1), ans + ch); // yes
    return x + y;
  }

}
