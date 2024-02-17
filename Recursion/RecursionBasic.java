public class RecursionBasic {
    // Method to print numbers from n to 1 in decreasing order recursively
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // Method to print numbers from 1 to n in increasing order recursively
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // Method to calculate the factorial of a number recursively
    public static int fact(int n) {
        return (n == 0) ? 1 : n * fact(n - 1);
    }

    // Method to calculate the sum of first n natural numbers recursively
    public static int calcSum(int n) {
        return (n == 1) ? 1 : n + calcSum(n - 1);
    }

    // Method to calculate the power of a number recursively
    public static int power(int x, int n) {
        return (n == 0) ? 1 : x * power(x, n - 1);
    }

    // Method to calculate the power of a number using optimized recursion
    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) { // even
            int halfPower = optimizedPower(x, n / 2);
            return halfPower * halfPower;
        } else { // odd
            int halfPower = optimizedPower(x, n / 2);
            return x * halfPower * halfPower;
        }
    }

    // Main method to demonstrate the recursive functions
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Printing in decreasing order:");
        printDec(n);

        System.out.println("Printing in increasing order:");
        printInc(n);

        System.out.println("Factorial of " + n + " is: " + fact(n));

        System.out.println("Sum of first " + n + " natural numbers is: " + calcSum(n));
        
        System.out.println("Power of 2 raised to " + n + " is: " + power(2, n));
        
        System.out.println("Optimized power of 2 raised to " + n + " is: " + optimizedPower(2, n));
    }
}