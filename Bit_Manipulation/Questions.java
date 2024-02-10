
public class Questions {

    // What is the value of x^x for any value of x?
    // Answer: x^x = 0 for any value of x.
    // Time Complexity: O(1)
    public static int xToTheX(int x) {
        int result = 0;

        // Loop through each bit of x
        for (int i = 0; i < 32; i++) {
            // Checking if the ith bit is set in x
            if (((x >> i) & 1) == 1) {
                // Setting the ith bit in result
                result |= (1 << i);
            }
        }

        return result;
    }

    // Swap two numbers without using any third variable.
    public static void swapNumbers(int x, int y) {
        System.out.println("Before swap: x = " + x + " and y = " + y);
        // Swap using xor
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " and y = " + y);
    }

    // Add 1 to an integer using Bit Manipulation
    // Answer: The expression -~x will add 1 to an integer x.
    public static int addOneToInt(int x) {
        return -~x;
    }

    // Convert uppercase characters to lowercase using bits
    public static void upperToLowerBit() {
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char)(ch | ' '));
        }
    }

    public static void main(String args[]) {
        int x = 5; // Example value of x
        System.out.println("Value of x^x for x = " + x + ": " + xToTheX(x));

        swapNumbers(3, 5);
    }
}