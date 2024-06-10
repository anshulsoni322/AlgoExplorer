
    // Quick Sort.

    // Time complexity -> 
    // Average Case = O(nlogn)
    // worst Case = O(n^2)

    // Space Complexity -> O(1)
    public class QuickSort {
    

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 2, 4, 6};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    /**
     * Sorts the array using QuickSort.
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIdx = partition(arr, left, right);
        quickSort(arr, left, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, right);
    }

    /**
     * Partitions the array and returns the pivot index.
     */
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, right);
        return i;
    }

    /**
     * Swaps two elements in the array.
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Prints the array elements.
     */
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
}