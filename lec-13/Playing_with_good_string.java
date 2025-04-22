import java.util.*;

public class Playing_with_good_string {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    sc.close();
  }

  public static int length_good_string(String str) {
    int ans = 0;
    int c = 0;
    for (int i = 0; i < str.length(); i++) {

      char ch = str.charAt(i);
      if (isVowel(ch)) {
        c++;
      } else {
        ans = Math.max(ans, c);
        c = 0;
      }

    }
    ans = Math.max(ans, c);
    return ans;
  }

  public static boolean isVowel(char ch) {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      return true;
    } else {
      return false;
    }
  }
}
