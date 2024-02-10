public class FastExponention{
    public static void main(String args[]){
        System.out.println(fastExpo(5,3));
    }
    public static int fastExpo(int a, int n) {
        // Initialize the answer to 1
        int ans = 1;

        // Loop until exponent becomes 0
        while (n > 0) {
            // If the least significant bit of n is set
            if ((n & 1) != 0) {
                // Multiply the answer by a
                ans = ans * a;
            }

            // Square the base number
            a = a * a;

            // Right shift the exponent to divide it by 2
            n = n >> 1;
        }

        // Return the final result
        return ans;
    }
}