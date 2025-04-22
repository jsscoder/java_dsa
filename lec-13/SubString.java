public class SubString {
  public static void main(String[] args) {
    String s = "codingblocks";
    // System.out.println(s.substring(4, 7));
    // System.out.println(s.substring(2));
    print_all_substring(s);
  }

  public static void print_all_substring(String s){
    for(int i=0; i<s.length();i++ ){
      for(int j=i+1; j<=s.length(); j++){
        System.out.println(s.substring(i,j));
      }
    }
  }
}
