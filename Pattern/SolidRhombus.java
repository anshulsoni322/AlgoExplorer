/**
 * SolidRhombus n -> 5
 *     *****
 *    *****
 *   *****
 *  *****
 * *****
 */
public class SolidRhombus {
    public static void main(String args[]){
        int n = 5;
        solidRhombus(n);
    }
    public static void solidRhombus(int n){
        for(int line = 1 ; line <= n ; line++){
            //Space
            for(int space = 1 ; space <= (n-line) ; space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= n ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}