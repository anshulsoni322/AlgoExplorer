
// Merge Sort sing Divide and Conquer

public class MergeSort {

    // Sorting method (Divide and Conquer)
    public static void mergeSort(int arr[], int startIdx, int endIdx) { 
        if (startIdx >= endIdx) {
            return;
        }
        int mid = startIdx + (endIdx - startIdx) / 2; // Calculate mid index
        mergeSort(arr, startIdx, mid); // Sort left half
        mergeSort(arr, mid + 1, endIdx); // Sort right half
        merge(arr, startIdx, mid, endIdx); // Merge sorted halves
    }

    // Merge method to merge two sorted parts
    public static void merge(int arr[], int startIdx, int mid, int endIdx) {
        int temp[] = new int[endIdx - startIdx + 1]; // Temporary array
        int i = startIdx; // Index for the first sorted part
        int j = mid + 1; // Index for the second sorted part
        int k = 0; // Index for temp array

        // Merge the two sorted parts into temp array
        while (i <= mid && j <= endIdx) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements of left sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right sorted part
        while (j <= endIdx) {
            temp[k++] = arr[j++];
        }

        // Copy temp array back to original array
        for (k = 0, i = startIdx; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    // Main method to demonstrate Merge Sort
    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}