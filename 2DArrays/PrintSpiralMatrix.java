
// Print Spiral Matrix
// 
// For a given 2d array print the 2d 
// array in spiral faction
//
// Initialize with the boundry then
// enter in the inner boundry one by one

public class PrintSpiralMatrix{
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        printSpiral(matrix);
    }

    public static void printSpiral(int matrix[][]){
        //Define boundaries
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){

            //TOP
            for(int col = startCol; col <= endCol; col++){
                System.out.print(matrix[startRow][col]+" ");
            }
            //RIGHT
            for(int row = startRow + 1; row <= endRow; row++){
                System.out.print(matrix[row][endCol]+" ");
            }
            //BOOTOM
            for(int col = endCol - 1; col >= startCol; col--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][col]+" ");
            }
            //LEFT
            for(int row = endRow - 1; row >= startRow + 1; row--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[row][startCol]+" ");
            }

            // Update boundaries
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
}