public class Occurrences {
    // Find the index of the first occurrence of key in the array
    public static int firstOccurrence(int[] arr, int key, int i) {
        // Base case: if the current index exceeds the array length
        if (i == arr.length) {
            return -1; // Key not found
        }

        // If the key is found at the current index
        if (arr[i] == key) {
            return i; // Return the index
        }

        // Recursively search in the rest of the array
        return firstOccurrence(arr, key, i + 1);
    }

    // Find the index of the last occurrence of key in the array
    public static int lastOccurrence(int[] arr, int key, int i) {
        // Base case: if the current index exceeds the array length
        if (i == arr.length) {
            return -1; // Key not found
        }

        // Recursively search in the rest of the array
        int isFound = lastOccurrence(arr, key, i + 1);

        // If the key is found later in the array and not found yet
        if (isFound == -1 && arr[i] == key) {
            return i; // Return the index
        }

        // Return the index found so far
        return isFound;
    }

    // Main method to test the firstOccurrence and lastOccurrence functions
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 4}; // Modify the array as needed
        int key = 3; // Modify the key as needed

        // Find the index of the first occurrence of the key
        int firstIndex = firstOccurrence(arr, key, 0);
        System.out.println("First occurrence of " + key + " is at index: " + firstIndex);

        // Find the index of the last occurrence of the key
        int lastIndex = lastOccurrence(arr, key, 0);
        System.out.println("Last occurrence of " + key + " is at index: " + lastIndex);
    }
}