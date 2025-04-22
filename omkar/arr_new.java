package omkar;

public class arr_new {

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {10, 20, 30, 40, 50};
        
        // Before swap
        System.out.println("Before swap: " + arr[0] + " " + arr[1]);
        
        // Call the swap method with the array and indices to swap
        swap(arr[0],arr[1]);
        
        // After swap
        System.out.println("After swap: " + arr[0] + " " + arr[1]);
    }

    // Method to swap elements in the array at given indices
    public static void swap(int a,int b) {
        // Swap elements at index i and j
        int temp = a;
        a=b;
        b=temp;
    }
}
