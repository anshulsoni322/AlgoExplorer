
    // Apply Merge sort to sort an array of Strings. 
    //  (Assume that all the characters in
    //  all the Strings are in lowercase).

    // Time Complexity ->
    //      Average & Worst Case = O(n log n)
    // Space Complexity ->
    //      Worst Case = O(n)

public class MergeSortStringArray {

    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        String[] sortedArr = mergeSort(arr, 0, arr.length - 1);
        for (String str : sortedArr) {
            System.out.println(str);
        }
    }

    public static String[] mergeSort(String[] arr, int lo, int hi) {
        if (lo == hi) {
            return new String[]{arr[lo]};
        }
        
        int mid = lo + (hi - lo) / 2;
        String[] leftSorted = mergeSort(arr, lo, mid);
        String[] rightSorted = mergeSort(arr, mid + 1, hi);
        
        return merge(leftSorted, rightSorted);
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] mergedArr = new String[m + n];
        
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }
        
        while (i < m) {
            mergedArr[k++] = arr1[i++];
        }
        
        while (j < n) {
            mergedArr[k++] = arr2[j++];
        }
        
        return mergedArr;
    }

    public static boolean isAlphabeticallySmaller(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }
}
