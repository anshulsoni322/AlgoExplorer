/**
 * BinarySearch -> 
 *  - define start and end.
 *  - break the array in half each time.
 *  - find the key in suitable part.
 */
public class BinarySearch {
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        int answer = binarySearch(numbers, key);
        System.out.println(answer);
    }
    public static int binarySearch(int numbers[],int key){
        int start = 0 , end = numbers.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (key == numbers[mid]) {
                return mid; // Key found
            }
            
            if (numbers[mid] < key) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return -1; //Key NOT found
    }
}