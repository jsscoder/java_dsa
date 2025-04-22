import java.util.*;

public class Leetcode386 {
  public static void main(String[] args) {
    int n = 13;
    List<Integer> ll = new ArrayList<>();
    Lexiographical(0, n, ll);

  }

  public static void Lexiographical(int curr, int n, List<Integer> ll) {
    if (curr > n) {
      return;
    }
    // System.out.println(curr);
    ll.add(curr);
    int i = 0;
    if (curr == 0) {
      i = 1;
    }
    for (; i <= 9; i++) {
      Lexiographical(curr * 10 + i, n, ll);
    }
  }
}
