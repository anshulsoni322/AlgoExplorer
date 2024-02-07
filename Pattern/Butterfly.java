/**
 * Butterfly Pattern n -> 4
 * *      *
 * **    **
 * ***  ***
 * ********
 * ********
 * ***  ***
 * **    **
 * *      *
 */
public class Butterfly {
    public static void main(String args[]){
        int n = 4;
        butterFly(n);
    }
    public static void butterFly(int n){
        //1st Half
        for(int line = 1 ; line <= n ; line++){
            //star -> i
            for(int star = 1 ; star <= line ; star++){
                System.out.print("*");
            }
            //space -> 2*(n-i)
            for(int space = 1 ; space <= 2*(n-line) ; space++){
                System.out.print(" ");
            }
            //space - i
            for(int star = 1 ; star <= line ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half
        for(int line = n ; line >= 1 ; line--){
            //star -> i
            for(int star = 1 ; star <= line ; star++){
                System.out.print("*");
            }
            //space -> 2*(n-i)
            for(int space = 1 ; space <= 2*(n-line) ; space++){
                System.out.print(" ");
            }
            //space - i
            for(int star = 1 ; star <= line ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}