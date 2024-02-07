/**
 * Number Pyramid n = 5
 *     1
 *    2 2
 *   3 3 3 
 *  4 4 4 4
 * 5 5 5 5 5
 */
public class NumPyramid {
    public static void main(String args[]){
        int n = 5;
        numPyramid(n);
    }
    public static void numPyramid(int n){
        for(int line = 1 ; line <= n ; line++){
            for(int space = 1 ; space <= n-line ; space++){
                System.out.print(" ");
            }
            for(int num = 1 ; num <= line ; num++){
                System.out.print(line+" ");
            }
            System.out.println();
        }
    }
}