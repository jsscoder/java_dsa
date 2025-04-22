public class reversal_algo {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, };
        int k = 3;
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        // logic
// start
Reverse(arr,0,n-k-1);
// last ke k element
Reverse(arr,n-k,n-1);
// all element
Reverse(arr, 0, n-1);

    }



	public static void Reverse(int[] arr, int i, int j) {


		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}

	}
}
