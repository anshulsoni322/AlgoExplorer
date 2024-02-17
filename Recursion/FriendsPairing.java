
// Friends Pairing Problem

// Given n friends, each one can be remain single or can be paired
// up with some other friend. Each friend can be paired only once.
// Find out the total number of ways in which friends can remain
// single or can be paired up.

public class FriendsPairing {

    // Method to calculate the total number of ways friends can remain single or be paired up
    public static int friendsPairing(int n) { // TC & SC -> O(n)
        // Base cases
        if (n == 1 || n == 2) {
            return n;
        }

        // Calculate the total number of ways
        int fnm1 = friendsPairing(n - 1); // Number of ways if the last friend remains single
        int fnm2 = friendsPairing(n - 2); // Number of ways if the last friend pairs up
        int pairWays = (n - 1) * fnm2; // Number of ways to pair up the last friend with the remaining (n - 1) friends
        int totWays = fnm1 + pairWays; // Total number of ways
        return totWays;
    }

    // Main method to demonstrate the friendsPairing function
    public static void main(String[] args) {
        int n = 3; // Number of friends
        int ans = friendsPairing(n);
        System.out.println("Total ways are = " + ans);
    }
}