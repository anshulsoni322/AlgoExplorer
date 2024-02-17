
/**
 * The Fibonacci series is a sequence of numbers in which each number
 * is the sum of the two preceding ones, usually starting with 0 and 1.
 * For example, the Fibonacci sequence begins as follows: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 */

public class NthFibonacci {
    // Method to calculate the nth term in the Fibonacci sequence recursively
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // Main method to test the fib function
    public static void main(String[] args) {
        int n = 10; // Change the value of n as needed
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }
}