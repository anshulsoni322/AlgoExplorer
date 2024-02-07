/**
 * Diamond Pattern n = 4
 *    *
 *   ***
 *  *****
 * *******
 * *******
 *  *****
 *   ***
 *    *
 */
public class DiamondPatt {
    public static void main(String args[]){
        int n = 5;
        diamondPatt(n);
    }
    public static void diamondPatt(int n){
        //1st Half
        for(int line = 1 ; line <= n ; line++){
            for(int space = 1 ; space <=(n-line) ; space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= (2*line)-1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half
        for(int line = n ; line >= 1 ; line--){
            for(int space = 1 ; space <=(n-line) ; space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <= (2*line)-1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}