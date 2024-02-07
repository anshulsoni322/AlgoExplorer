
//  Write a program to Find Transpose of a Matrix.
//
// What is Transpose -> 
//  Transpose of a matrix is the process of
//  swapping the rows to columns.
//
//  For a 2x3 matrix,
//      Matrix
//      a11 a12 a13
//      a21 a22 a23
//      Transposed Matrix
//      a11 a21
//      a12 a22
//      a13 a23
//
// Time and Space Complexity -> O(n×m)

public class TransposeMatrix{
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},
                          {4,5,6}};
        transposeMatrix(matrix);
    }
    public static void transposeMatrix(int matrix[][]){
        // Display original matrix
        printMatrix(matrix);

        int row = matrix.length;
        int col = matrix[0].length;
        int transpose[][] = new int[col][row];

        // Transpose the matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        // print the transposed matrix
        printMatrix(transpose);
    }
    public static void printMatrix(int matrix[][]){
        System.out.println("The Matrix is -> ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}