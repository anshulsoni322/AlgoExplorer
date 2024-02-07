/**
 * HollowRhombus n = 5
 *     *****
 *    *   *
 *   *   *
 *  *   *
 * *****
 */
public class HollowRhombus {
    public static void main(String args[]){
        int n = 5;
        hollowRhombus(n);
    }
    public static void hollowRhombus(int n){
        for(int line = 1 ; line <= n ; line++){
            for(int space = 1 ; space <= (n-line) ; space++){
                System.out.print(" ");
            }
            //hollow rectangle - stars
            for(int star = 1 ; star <= n ; star++){
                if(line == 1 || line == n || star == 1 || star == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}