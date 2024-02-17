
// Tiling Problem ->
// Given a "2 * n" board and tiles of size "2 * 1",count the
// number of ways to tile the given board using the 2 * 1
// tiles. (A tile can either be placed horizontally and vertically.)

public class Tiling{

    public static int tilingProblem(int n) { // 2 x n (floor size)
        // Base case: When the floor size is 0 or 1, there's only one way to tile it
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive step:
        // - For vertical choice: Place a tile vertically, reducing the floor size by 1
        int vertical = tilingProblem(n - 1);

        // - For horizontal choice: Place a tile horizontally, reducing the floor size by 2
        int horizontal = tilingProblem(n - 2);

        // Total ways is the sum of ways when placing the tile vertically and horizontally
        return vertical + horizontal;
    }

    public static void main(String args[]){
        int n = 3; // Example board size

        // Calculate and print the total number of ways to tile the board
        System.out.println("Total ways to tile the 2 * " + n + " int n = 3; // Example board size\r\n" + //
                        "\r\n" + //
                        "        // Calculate and print the total number of ways to tile the board\r\n" + //
                        "        System.out.println(\"Total ways to tile the \" + n + \" * 2 board: \" + tilingProblem(n));board: " + tilingProblem(n));
    }
}