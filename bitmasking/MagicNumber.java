public class MagicNumber {
  public static void main(String[] args) {
    
    int n=13;
    int mul=5;
    int ans=0;

    while(n>0){
      if((n&1)!=0){
        ans+=mul;
      }
      mul=mul*5;
      n >>=1;
    }
    System.out.println("answer:::");
    System.out.println(ans);
  }
}
