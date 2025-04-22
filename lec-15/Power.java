public class Power {
  public static void main(String[] args) {
int n=3;
int p=2;
System.out.println(Pow(p, n));// pokemon lol

  }


  public static int Pow(int p, int n) {

    if (p == 0) {
      return 1;
    }
  
    int prevPower=Pow(p-1, n);
    return n*prevPower;
  }
}
