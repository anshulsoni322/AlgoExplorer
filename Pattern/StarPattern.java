/**
 * starPattern for n = 4
 * *
 * **
 * ***
 * ****
 * *****
 */
public class StarPattern {
    public static void main(String args[]){
        int n = 4;
        starPattern(n);
    }
    public static void starPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}