public class WrapperClass {
  public static void main(String[] args) {
    int a = 10;
    Integer a1 = 10;
    System.out.println(a);

    // auto-boxing

    // PRIMITIVE -> WRAPPER (STACKS->HEAP)
    int b = 10;
    Integer b1 = 103;
    b1 = b;
    // complexity O(n)

    // Un-boxing
    // (HEAP->STACKS)
    b = b1;
// Integer c1=12;
// Integer c2=12;
// Integer c3=152;
// Integer c4=152;
// System.out.println(c1==c2);
// System.out.println(c3==c4);

// int cache -128 to 127 same address

  }
}
