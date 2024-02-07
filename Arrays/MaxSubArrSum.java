/**
 * Max SubArray Sum.
 *  #1 Method -> Brute Force
 *  #2 Method -> Prefix Sum
 *  #3 Method -> Kadane's Algoritham
 */
public class MaxSubArrSum {
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        // Brute Force Method
        System.out.println("Maximum Subarray Sum (Brute Force): " + maxSubArrSum(numbers));
        
        // Prefix Sum Method
        System.out.println("Maximum Subarray Sum (Prefix Sum): " + prefixSum(numbers));
        
        // Kadane's Algorithm
        System.out.println("Maximum Subarray Sum (Kadane's Algorithm): " + kadane(numbers));
    }
    // #1 Method -> Brute Force
    public static int maxSubArrSum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int start = 0 ; start < numbers.length ; start++){
            for(int end = start ; end < numbers.length ; end++){
                currSum = 0;
                for(int curr = start ; curr <= end ; curr++){
                    currSum += numbers[curr];
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    // #2 Prefix Sum
    public static int prefixSum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[numbers.length];

        // Calculate prefix sum
        prefix[0] = numbers[0];
        for(int turn = 1 ; turn < numbers.length ; turn++){
            prefix[turn] = prefix[turn-1] + numbers[turn];
        }

        // Calculate maximum subarray sum
        for(int start = 0 ; start < numbers.length ; start++){
            for(int end = start + 1 ; end < numbers.length ; end++){
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    // #3 Method Kadane's Algoritham
    public static int kadane(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int turn = 0 ; turn < numbers.length ; turn++){
            currSum += numbers[turn];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}