/**
 * InverStarPatt -> n=4
 *  ****
 *  ***
 *  **
 *  *
 */
public class InverStarPatt {
    public static void main(String args[]){
        int n = 4;
        inverStarPatt(n);
    }
    public static void inverStarPatt(int n){
        for(int line=0;line<n;line++){
            for(int star=0;star<n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}