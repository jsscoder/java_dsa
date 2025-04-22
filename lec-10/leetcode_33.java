public class leetcode_33 {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int item = 0;
        System.out.println(Search(arr, item));
    }

    public static int Search(int arr[], int item) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] > arr[low]) {
                // upper line pe hoon
                if (arr[low] <= item && arr[mid] > item) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // lower line pe hoon
                if (arr[mid] < item && arr[high] >= item) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
