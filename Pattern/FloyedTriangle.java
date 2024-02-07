/**
 * FloyedTriangle n -> 5
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */
public class FloyedTriangle {
    public static void main(String args[]){
        int n = 5;
        floyedTriangle(n);
    }
    public static void floyedTriangle(int n){
        int counter = 1;
        for(int line = 1 ; line <= n ; line++){
            //inner - how many time will counter be printed
            for(int turn = 1 ; turn <= line ; turn++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}