public class String_permutation {
  public static void main(String[] args) {
      String str = "aabc";
      // Checking duplicates
      permutationString(str, "");
  }

  public static void permutationString(String ques, String ans) {
      if (ques.length() == 0) {
          System.out.println(ans);
          return;
      }

      // Use a boolean array to track used characters to avoid duplicates
      for (int i = 0; i < ques.length(); i++) {
          char ch = ques.charAt(i);
          if (isDuplicate(ques, i)) continue;  // Skip duplicate characters at the same position

          String s1 = ques.substring(0, i);
          String s2 = ques.substring(i + 1);
          permutationString(s1 + s2, ans + ch);
      }
  }

  // Method to check if the character at the current index has been used before
  public static boolean isDuplicate(String str, int idx) {
      // Check for duplicate characters in the remaining part of the string
      for (int i = idx + 1; i < str.length(); i++) {
          if (str.charAt(i) == str.charAt(idx)) {
              return true;
          }
      }
      return false;
  }
}
