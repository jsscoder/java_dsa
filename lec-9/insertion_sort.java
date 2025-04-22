public class insertion_sort {
    public static void main(String[] args) {
        // selection sort
        int arr[] = { 2, 3, 4, 5, 6, 8, 9, 7 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }



public static void insert_last(int arr[], int i) {
    int item = arr[i];
    int j = i - 1;
    while (j >= 0 && arr[j] > item) {
        arr[j + 1] = arr[j];
        arr[j] = item;
        j--;
    }

    // index bola hota j+1 return karenge
}

public static void insertionSort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        insert_last(arr, i);
    }
}
}
