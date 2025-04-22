

public class l_seaarch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 1, 3, 5, 7, 9, 11, 15, };
        int item = 5;
        System.out.println(l_search(arr, item));

    }

    public static int l_search(int[] arr, int item) {
        // linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
