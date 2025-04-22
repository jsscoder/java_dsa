public class ArrayRecursion {
  public static void main(String[] args) {

    int arr[] = { 2, 3, 4, 5, 4, 7, 6 };
    int item = 4;
    // return the indexx the user searching for first time
    System.out.println(ReturnArr(arr, item, 0));

  }

  public static int ReturnArr(int[] arr, int item, int idx) {

    if (idx == arr.length) {
      return -1;
    }

    if (arr[idx] == item) {
      return idx;
    }

    return ReturnArr(arr, item, ++idx);

  }
}
