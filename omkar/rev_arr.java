package omkar;

public class rev_arr {

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {3, 5, 6, 2, 7};

        // Reverse the array
        Rev(arr);

        // Call the Print method
        Print(arr);
    }

    // Method to print the array
    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // For better formatting
    }

    // Method to reverse the array in place
    public static void Rev(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
} 
