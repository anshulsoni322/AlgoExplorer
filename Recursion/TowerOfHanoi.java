
// TOWER OF HANOI

// You have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle
// starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on
// top of an even larger one).
// You have the following constraints:
// (1) Only one disk can be moved at a time.
// (2) A disk is slid off the top of one tower onto another tower.
// (3) A disk cannot be placed on top of a smaller disk. Write a program to move the disks from
// the first tower to the
// last using Stacks.
// Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'.
// An example with 2 disks i.e. N=2:
// Step 1 : Shift the first disk from 'A' to 'B'.
// Step 2 : Shift the second disk from 'A' to 'C'.
// Step 3 : Shift the first disk from 'B' to 'C'.

public class TowerOfHanoi { // TC : O(2 ^ n), SC : O(n)
    // Recursive method to solve the Tower of Hanoi problem
    
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        // Base case: If there is only one disk, move it directly from source to destination
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + src + " to " + dest);
            return;
        }
        
        // Move n-1 disks from source to helper using destination as a helper rod
        towerOfHanoi(n - 1, src, dest, helper);
        
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + src + " to " + helper);
        
        // Move the n-1 disks from helper to destination using source as a helper rod
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 4; // Number of disks
        towerOfHanoi(n, "A", "B", "C"); // Calling the towerOfHanoi method
    }
}
