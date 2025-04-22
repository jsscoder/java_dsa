import java.util.*;
//import java.lang.*;

public class DemoList {
  public static void main(String[] args) {

    // dynamic array-> non primitive -> heap
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    a1.add(45);
    a1.add(40);
    a1.add(42);
    a1.add(48);
    a1.add(41);
    // a1.add(3, 23);
    // replaces the value
    a1.set(0, 12);
    a1.remove(0);

    System.out.println(a1);
  }
}
