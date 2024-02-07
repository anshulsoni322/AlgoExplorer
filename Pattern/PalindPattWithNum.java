/**
 * Palindrome Pattern With Numbers n = 5
 *         1
 *       2 1 2
 *     3 2 1 2 3
 *   4 3 2 1 2 3 4
 * 5 4 3 2 1 2 3 4 5
 */
public class PalindPattWithNum {
    public static void main(String args[]){
        int n = 5;
        palindPattWithNum(n);
    }
    public static void palindPattWithNum(int n){
        for(int line = 1 ; line <= n ; line++){
            for(int space = 1 ; space <= n-line ; space++){
                System.out.print(" ");
            }
            for(int nums = line ; nums >= 1 ; nums--){
                System.out.print(nums);
            }
            for(int nums = 2 ; nums <= line ; nums++){
                System.out.print(nums);
            }
            System.out.println();
        }
    }
}