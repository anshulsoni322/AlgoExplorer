
// Find Sum of Both Digonals
//
// For a given n = m 2D array find the
// sum of both the digonals
//
// Primary Digonal -> idx == idx
// Secondary Digonal -> i + j = n - 1 (Brute Force Approch)
//                      j = n - i - 1 (Optimized Approch)

public class DigonalSum{
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        int ans = digonalSumBF(matrix); // Brute Force
        System.out.println(ans); // TC -> O(n^2)

        ans = digonalSumOA(matrix); // Optimize Approch
        System.out.println(ans); // TC -> O(n)
    }

    public static int digonalSumBF(int matrix[][]){ //Brute Force
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){

                // Primary Digonal
                if(i == j){
                    sum += matrix[i][j];
                }

                // Secondary Digonal
                else if(i + j == matrix.length - 1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int digonalSumOA(int matrix[][]){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){

            // Primary Digonal
            sum += matrix[i][i];

            // Secondary Diagonal (except for the center element)
            if(i != matrix.length - 1 - i){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
}