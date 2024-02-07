/**
 * ZeroOneTriangle n -> 5
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 */
public class ZeroOneTriangle {
    public static void main(String args[]){
        int n = 5;
        zeroOneTriangle(n);
    }
    public static void zeroOneTriangle(int n){
        for(int line = 1 ; line <= n ; line++){
            for(int column = 1 ; column <= line; column++){
                if((line+column)%2==0){//Even
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}