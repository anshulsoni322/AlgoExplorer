public class SortedAndRotatedArray {

    /**
     * Searches for the target element in the sorted and rotated array.
     * We are going to use two methods: recursive and iterative.
     */
    
    public static int searchRecursive(int[] arr, int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        
        // Check if mid is in the left sorted part
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar < arr[mid]) {
                return searchRecursive(arr, tar, si, mid - 1);
            } else {
                return searchRecursive(arr, tar, mid + 1, ei);
            }
        } else { // Mid is in the right sorted part
            if (arr[mid] < tar && tar <= arr[ei]) {
                return searchRecursive(arr, tar, mid + 1, ei);
            } else {
                return searchRecursive(arr, tar, si, mid - 1);
            }
        }
    }

    public static int searchIterative(int[] arr, int target) {
        int si = 0;
        int ei = arr.length - 1;
        
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // Check if mid is in the left sorted part
            if (arr[si] <= arr[mid]) {
                if (arr[si] <= target && target <= arr[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            } else { // Mid is in the right sorted part
                if (arr[mid] <= target && target <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2};
        int target = 2;
        int resultRecursive = searchRecursive(arr, target, 0, arr.length - 1);
        int resultIterative = searchIterative(arr, target);
        System.out.println("Index of target " + target + " (recursive): " + resultRecursive);
        System.out.println("Index of target " + target + " (iterative): " + resultIterative);
    }
}