public class IsSorted {
    // Check if an array is sorted in non-decreasing order recursively
    public static boolean isSorted(int[] arr, int i) { 
        // Base case: if the current index is the last index
        if (i == arr.length - 1) {
            return true; // Array is sorted
        }

        // Check if the current element is greater than the next element
        if (arr[i] > arr[i + 1]) {
            return false; // Array is not sorted
        }

        // Recursively check the next pair of elements
        return isSorted(arr, i + 1);
    }

    // Main method to test the isSorted function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Modify the array as needed
        System.out.println("Is the array sorted? " + isSorted(arr, 0));
    }
}