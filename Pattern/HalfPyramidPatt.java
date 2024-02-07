/**
 * halfPyramidPatt n -> 4
 *  1
 *  12
 *  123
 *  1234
 */
public class HalfPyramidPatt {
    public static void main(String args[]){
        int n = 4;
        halfPyramidPatt(n);
    }
    public static void halfPyramidPatt(int n){
        for(int line = 0 ; line < n ; line++){
            for(int number = 1 ; number <= line ; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}