/**
 * ReverseArray ->
 * For reducing time and space 
 * complexity we will make changes in original 
 * array Swap the values of the farmost indexes
 * for half of length of array.
 */
public class ReverseArray {
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        reverseArray(numbers);
        for(int turn = 0 ; turn < numbers.length ; turn++){
            System.out.print(numbers[turn]+" ");
        }
    }
    public static void reverseArray(int numbers[]){
        int first = 0 , last = numbers.length-1;
        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
}