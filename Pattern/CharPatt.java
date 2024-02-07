/**
 * CharPatt n -> 4
 * A
 * BC
 * DEF
 * GHIJK
 */
public class CharPatt {
    public static void main(String args[]){
        int n = 4;
        charPatt(n);
    }
    public static void charPatt(int n){
        char ch = 'A';
        for(int line = 1; line < n ; line++){
            for(int chars = 1 ; chars <= line ; chars++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}