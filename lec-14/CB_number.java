import java.util.*;

class CB_number {

  public static void main(String a[]) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    printAllSubstring(n);
    sc.close();
  }

  public static boolean isCBnumber(long num) {
    int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
    if (num == 0 || num == 1) {
      return false;
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num)
        return true;
    }
    for (int i = 0; i < arr.length; i++) {
      if (num % arr[i] == 0)
        return false;
    }
    return true;

  }

  public static void printAllSubstring(String s) {
    int c = 0;
    // to print substring of s
    boolean[] visited = new boolean[s.length()];
    for (int len = 1; len <= s.length(); len++) {
      for (int j = len; j <= s.length(); j++) {
        //System.out.println(j);

        int i = j - len;
       // System.out.println(s.substring(i, j));
        long num=Long.parseLong(s.substring(i, j));
        if (isCBnumber(num) && isVisited(visited, i, j)) {
          c++;

          // visited marked
          for (int k = i; k < j; k++) {
            visited[k] = true;
          }
        }
      }
    }
    System.out.println(c);

  }

  public static boolean isVisited(boolean visited[], int i, int j) {
    // from i to j-1;
    for (int k = i; k < j; k++) {
      if (visited[k] == true) {
        return false;
      }

    }
    return true;
  }
}