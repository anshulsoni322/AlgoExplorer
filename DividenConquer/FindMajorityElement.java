    /**
     * Given an array nums of size n, return the majority element. (MEDIUM)
     * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume
     * that the majority element always exists in the array.
     * Sample Input 1 : nums = [3,2,3]
     * Sample Output 1 : 3
     * 
     * Time Complexity: O(n log n)
     * The array is divided into halves recursively, which takes O(log n) time, 
     * and counting occurrences in each range takes O(n) time. Therefore, 
     * the overall time complexity is O(n log n).
     *
     * Space Complexity: O(log n)
     * The space complexity is O(log n) due to the recursive call stack depth.
     */
public class FindMajorityElement {

    // Counts the occurrences of num in the subarray nums[lo..hi]
    private static int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    // Recursive method to find the majority element in the subarray nums[lo..hi]
    private static int majorityElementRec(int[] nums, int lo, int hi) {
        // Base case: if there is only one element, return it
        if (lo == hi) {
            return nums[lo];
        }

        // Recur on the left and right halves of this slice
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);

        // If the two halves agree on the majority element, return it
        if (left == right) {
            return left;
        }

        // Otherwise, count each element and return the one with the higher count
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);
        return leftCount > rightCount ? left : right;
    }

    // Public method to find the majority element in the entire array
    public static int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums)); // Output: 2
    }
}
