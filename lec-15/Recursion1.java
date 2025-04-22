import java.util.*;
public class Recursion1 {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int n = sc.nextInt();
    System.out.println(fact(n));
    sc.close();

  }

  public static int fact(int n) {
    // base case
    if(n==0){
      return 1;
    }
    int fn = fact(n - 1);
    return n * fn;
    

  }
}