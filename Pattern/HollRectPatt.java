/**
 * HollRectPatt
 *  *****
 *  *   *
 *  *   *
 *  *****
 */
public class HollRectPatt {
    public static void main(String args[]){
        int height = 4;
        int lenght = 5;
        hollRectPatt(height,lenght);
    }
    public static void hollRectPatt(int totalRow,int totalCol){
        for(int line = 1 ; line <= totalRow ; line++){
            for(int column = 1 ; column <= totalCol ; column++){
                if(line == 1 || line == totalRow || column == 1 || column == totalCol){
                    //bounary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}