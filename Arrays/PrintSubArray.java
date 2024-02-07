/**
 * Print SubArray ->
 * A "continus" part of array
 */
public class PrintSubArray {
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        priSubArr(numbers);
    }
    public static void priSubArr(int numbers[]){
        for(int start = 0 ; start < numbers.length ; start++){
            for(int end = start ; end < numbers.length ;end++){
                for(int curr = start ; curr <= end ; curr++){
                    System.out.print(numbers[curr]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}