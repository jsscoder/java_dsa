
import java.util.Arrays;

public class Rev_string {
  public static void main(String[] args) {
    // leetcode 151

    String s = "the sky is blue";
    s.trim();
    System.out.println(s);
    String[] arr = s.split(" +");
    System.out.println(Arrays.toString(arr));

    String ans = "";
    for (int i = arr.length - 1; i >= 0; i--) {
      ans = ans + arr[i] + " ";


    }
    System.out.println(ans);
  }
}
