import java.util.*;

public class DemoList2 {
  public static void main(String[] args) {
     ArrayList<Integer> a2 = new ArrayList<Integer>();
     
    a2.add(45);
    a2.add(40);
    a2.add(42);
    a2.add(48);
    a2.add(41);
  //  // Collections.sort(a2);
  // //  System.out.println(a2);

  // for(int i=0; i<a2.size(); i++){
  //   System.out.print(a2.get(i)+" ");
  // }

// for each loop
int arr[]=new int[5];
for (int i : a2) {
  System.out.print(i+" ");
}
// default capacity is 10 arraylist
  //System.out.println();
  
  }
}
