public class Panlindrome {
  public static void main(String[] args) {
    String s1="nitin";
    System.out.println(isPalindrome(s1));
  }

  public static boolean isPalindrome(String s){
    // 2 ptr approach
    int i=0;
    int j=s.length()-1;
    while(i<j){
      if(s.charAt(i)!=s.charAt(i)){
        return false;
      }
i++;
j--;

    }
    return true;
  }
}
