/**
 * LinearSearch ->
 * Find the INDEX of element in a given array.
 * Example -> 
 * array is 2,4,6,8,10,16 and key is 10
 * Answer -> 4
 */
public class LinearSearch {
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,16};
        int key = 10;
        int index = linearSearch(numbers,key);
        if(index == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index " + index);
        }
    }
    public static int linearSearch(int numbers[],int key){
        for(int turn = 0 ; turn < numbers.length ; turn++){
            if(numbers[turn] == key){
                return turn;
            }
        }
        return -1;
    }
}