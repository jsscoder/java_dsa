public class spiral_array {
    public static void main(String[] args) {
        int arr [][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        print(arr);
    }

    public static void print(int[][] arr) {
        int minc = 0;
        int minr = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;

        int te = arr.length * arr[0].length;
        int c = 0;
        while (c < te) {
            for (int i = minc; i < maxc; i++) {
                System.out.println(arr[minr][i] + "");
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr; i++) {
                System.out.println(arr[i][maxc] + " ");
                c++;
            }
            maxc--;
            for (int i = maxc; i < minc; i--) {
                System.out.println(arr[maxr][i] + " ");
                c++;
            }
            maxr--;
            for (int i = maxr; i < minr; i--) {
                System.out.println(arr[i][minc] + " ");
                c++;

            }
            minc++;
        }
    }

}
