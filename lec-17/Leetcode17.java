
import java.util.*;

public class Leetcode17 {
  static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

  public static void main(String[] args) {
    String ques = "236";
    List<String> ll = new ArrayList<>();
    LetterCombinations(ques, "", ll);
    
  }

  public static void LetterCombinations(String ques, String ans, List<String> ll) {
    // char ch=ques.charAt(0);

    // base case
    if (ques.length() == 0) {
      System.out.println(ans);
      return;
    }
    char ch = ques.charAt(0);
    String press = key[ch - 48];
    for (int i = 0; i < press.length(); i++) {
      LetterCombinations(ques.substring(1), ans + press.charAt(i), ll);
    }

  }
}
