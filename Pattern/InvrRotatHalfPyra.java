/**
 * Inverted Roatated Half Pyramid n -> 4
 *     *
 *    **
 *   ***
 *  ****
 */
public class InvrRotatHalfPyra {
    public static void main(String args[]){
        int n = 4;
        invrRotatHalfPyra(n);
    }
    public static void invrRotatHalfPyra(int n){
        for(int line = 1 ; line <= n ; line++){
            for(int space = 1 ; space <= n-line ; space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= line ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}