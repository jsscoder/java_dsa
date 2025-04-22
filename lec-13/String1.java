public class String1 {

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    // s2="omkar";
    System.out.println(s2);
    String s3 = new String("Hello");
    System.out.println(s1 == s3);// compares address
    System.out.println(s1.equals(s3));// compares content

    String s6 = "rajkaju";
    String s7 = "raj" + "kaju";

    System.out.println(s6 == s7);
    System.out.println(s1.charAt(2));

  }
}