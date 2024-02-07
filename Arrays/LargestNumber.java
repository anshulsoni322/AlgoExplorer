/**
 * Largest Number
 * Find the LARGEST number in a given array.
 * Example -> array is 1,2,6,5,4
 * Answer -> 6
 */
public class LargestNumber {
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,4,5};
        int largestNum = largestNum(numbers);
        System.out.println("The largest number is = "+largestNum);
    }
    public static int largestNum(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int turn = 0 ; turn < numbers.length ; turn++){
            if(largest < numbers[turn]){
                largest = numbers[turn];
            }
        }
        return largest;
    }
}