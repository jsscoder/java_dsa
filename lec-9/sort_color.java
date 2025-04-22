public class sort_color {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };

    }

    public static void DutchNationalFlag(int[] arr) {
        // leetcode 75

        // white--0
        // red --1
        // pink--2
        int w = 0;
        int p = arr.length - 1;
        int i = 0;
        while (i <= p) {
            if (arr[0] == 0) {
                int temp = arr[w];
                arr[w] = arr[i];
                arr[i] = temp;
                w++;
                i++;
            } else if (arr[i] == 2) {
                int temp = arr[p];
                arr[p] = arr[i];
                arr[i] = temp;
                p--;
            } else {
                i++;
            }
        }

    }
}
//  solve leetcode hw
