public class ArraySorted {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 5, 5, 7, 9 };
    System.out.println(Sorted(arr, 1));
  }

  public static boolean Sorted(int arr[], int i) {
    // int n=arr.length;
    // if(n==1){
    // return true;
    // }

    if (i == arr.length) {
      return true;
    }
    if (arr[i] < arr[i - 1]) {
      return false;
    }
    return Sorted(arr, i + 1);

  }
}
