public class Set_Unset {
  public static void main(String[] args) {

    int n = 84;
    int i = 3;
    //
    System.out.println("_________________");
    System.out.println(isSet(n, i));
  }

  public static boolean isSet(int n, int i) {
    int mask = (1 << i);
    if ((n & mask) != 0) {
      return true;
    } else {
      return false;
    }
  }
}
