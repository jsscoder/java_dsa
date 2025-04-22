import java.util.Scanner;

public class arr {

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        // System.out.println(arr[0]);
        // System.out.println(arr[0]);
        // System.out.println(arr[0] [2]);
        // define col(wrong)
        // define col(correct)
int [][] arr3={{2,4,4,5},
{2,3,4,5}
};
        // user input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = sc.nextInt();
                // System.out.println(arr[i][j]);
            }

        }
        Display(arr2);

    }

    public static void Display(int[][] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                // arr2[i][j] = sc.nextInt();
                // System.out.println(arr[i][j]);
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }
    }
}
