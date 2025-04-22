public class leetcode_240 {

    public static void main(String[] args) {

        // int[][] arr = { { 2, 3, 1, 4 }, { 5, 6, 7, 9 }, { 8, 12, 11, 10 }, { 16, 15,
        // 14, 13 } };
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        // Transpose(arr);
        System.out.println(Search(arr, 789));
    }

    public static boolean Search(int arr[][], int item) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == item) {
                return true;
            } else if (arr[row][col] > item) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
