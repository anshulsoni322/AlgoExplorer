/**
 * Inverted rotated pyramid With numbers n -> 4
 *    *
 *   **
 *  ***
 * ****
 */
public class InvrRotatPyraWithNum {
    public static void main(String args[]){
        int n = 4;
        invrRotatPyraWithNum(n);
    }
    public static void invrRotatPyraWithNum(int n){
        for(int line=0;line<n;line++){
            for(int j=1;j<=n-line;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}