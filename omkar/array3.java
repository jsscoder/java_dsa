package omkar;

public class array3 {
    
    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 8, 3, 12, 7, 2, 9};
        
        // Target to search for
        int target = 12;
        
        // Call the linearSearch method
        int result = linearSearch(arr, target);
        
        // Output the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}
