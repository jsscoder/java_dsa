import java.util.Scanner;

public class Codeforces_535B {
  public static void main(String[] args) {
    System.out.println("lucky number:");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println("--------------");
    System.out.println("lucky number index: " + Index(s));
  }

  public static int Index(String s) {
    int n = s.length();
    int pos = 0;
    int count = (1 << n) - 2;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == '7') {
        count += (1 << pos);

      }
      pos++;
    }
    return count + 1;
  }
}
