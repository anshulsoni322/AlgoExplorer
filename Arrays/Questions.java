//Q1 - WAF to find does a array contains duplicate elements
// Q2 - Return the index of the target integer in a rotated sorted array, or -1 if not found.
// Runtime complexity must be O(log n).

import java.util.Arrays;

public class Questions{
    public static void main(String args[]){
        // Question 1
        int nums[] = {1,2,3,1};
        System.err.println(isDuplicate_1(nums)); //TC = O(n^2)
        System.out.println(isDuplicate_2(nums)); //TC = O(n)

        // Question 2
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Output: " + search(nums1, target1)); // Output: 4
    }
    
    public static boolean isDuplicate_1(int nums[]){
        //Edge Case
        if (nums == null || nums.length == 0) {
            return false;
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i ; j++){
                //If elements found equal, duplicate found
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isDuplicate_2(int nums[]){
        // Edge Case
        if (nums == null || nums.length == 0) {
            return false;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            // If adjacent elements are equal, duplicate found
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // If the left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Search in the left half
                } else {
                    left = mid + 1; // Search in the right half
                }
            }
            // If the right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }
        }

        return -1; // Element not found
    }
}