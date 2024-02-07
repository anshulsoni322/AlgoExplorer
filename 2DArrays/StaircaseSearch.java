
// Search in Sorted Matrix
//
// Array is sorted by row and column wise
// in ascending order
// We have to search for the key
// 
// Time Complexity -> O(n+m)

public class StaircaseSearch{
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key = 33;
        staircaseSearch(matrix,key);
    }
    public static boolean staircaseSearch(int matrix[][],int key){
        //Starting from TOP - RIGHT
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            //Key Found
            if(matrix[row][col] == key){ 
                System.out.println("Found Key at ("+row+","+col+").");
                return true;
            }
            //Moving Left
            else if(key < matrix[row][col]){ 
                col--;
            }
            // Moving Down
            else { 
                row++;
            }
        }
        System.out.println("Key not found.");
        return false;
    }
}