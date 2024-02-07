/**
 * Pair in a Array ->
 */
public class PairsInArray {
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printpairs(numbers);
    }
    public static void printpairs(int arr[]){
        for(int turn = 0 ; turn < arr.length ; turn++){
            int curr = arr[turn];
            for(int end = turn + 1 ; end < arr.length; end++){
                System.out.println("("+curr+","+arr[end]+") ");
            }
            System.out.println();
        }
    }
}