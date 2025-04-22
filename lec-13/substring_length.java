public class substring_length {
  public static void main(String[] args) {
    
String str="codingBlocks";
printLength(str);

  }
  public static void printLength(String str){
    for(int len=0; len<str.length(); len++){
      for(int j=len; j<=str.length(); j++){
       int i=j-len;
       System.out.println(str.substring(i,j));
      }
    }
  }
}
