
// Inversion Count: For an array, inversion count indicates how far (or close) the array is from
// being sorted. If the array is already sorted then the inversion count is 0. If an array is
// sorted in the reverse order then the inversion count is the maximum.
// Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
// Sample Input 1 : N = 5, arr[ ] = {2, 4, 1, 3, 5}
// Sample Output 1 : 3, because it has 3 inversions - (2, 1), (4, 1), (4, 3). 

public class InversionCount {

    // Merges two subarrays of arr[] and counts inversions
    public static int merge(int arr[], int left, int mid, int right) {
        int i = left, j = mid, k = 0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];
        
        // Merge the two subarrays
        while (i < mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i); // Count inversions
            }
        }
        
        // Copy the remaining elements of left subarray, if any
        while (i < mid) {
            temp[k++] = arr[i++];
        }
        
        // Copy the remaining elements of right subarray, if any
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        // Copy the merged subarray into the original array
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
        
        return invCount;
    }

    // Sorts the array and returns the number of inversions
    private static int mergeSort(int arr[], int left, int right) {
        int invCount = 0;
        if (right > left) {
            int mid = (right + left) / 2;
            
            invCount += mergeSort(arr, left, mid); // Left subarray inversions
            invCount += mergeSort(arr, mid + 1, right); // Right subarray inversions
            invCount += merge(arr, left, mid + 1, right); // Merge and count split inversions
        }
        return invCount;
    }

    // Returns the number of inversions in the array
    public static int getInversions(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println("Inversion Count = " + getInversions(arr)); // Output the inversion count
    }
}
