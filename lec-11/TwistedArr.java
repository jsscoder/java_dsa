public class TwistedArr {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 4, 1},
            {21, 12, 6, 8}
        };
        print(arr);
    }

    public static void print(int[][] arr) {
        // Loop through each column
        for (int col = 0; col < arr[0].length; col++) {
            // For even columns, print from top to bottom
            if (col % 2 == 0) {
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            }
            // For odd columns, print from bottom to top
            else {
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}
