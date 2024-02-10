public class Operations {
    
    // Get ith bit of a number
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n & bitMask) == 0 ? 0 : 1;
    }

    // Set ith bit of a number
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Clear ith bit of a number
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    
    // Update ith bit of a number
    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    // Clear I Bit of a number
    public static int clearIBit(int n, int i) {
        int bitMask = (~0) << i;
        return n | bitMask;
    }
    
    // Clear bits in a range from i to j of a number
    public static int clearBitsinRange(int n, int i, int j) {
        int a = ~0 << i;
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    
    // Check if a number is a power of 2
    public static boolean isPowerof2(int n) {
        return (n & (n - 1)) == 0;
    }
    
    // Count number of set bits in a number
    public static int countSetBits(int n) {
        int setBits = 0;
        int bitMask = 1;
        while (n != 0) {
            if ((n & bitMask) != 0) {
                setBits++;
            }
            n = n >> 1;
        }
        return setBits;
    }

    // A faster method to count set bits in a number
    public static int countSetBits2(int n) {
        int setBits = 0;
        while (n > 0) {
            n = n & (n - 1);
            setBits++;
        }
        return setBits;
    }
    public static void main(String args[]) {
        int n = 10;
        int i = 2;
        
        int get = getIthBit(n, i);
        System.out.println("Get ith bit = " + get);

        int set = setIthBit(n, i);
        System.out.println("Set ith bit = " + set);

        int clear = clearIthBit(n, i);
        System.out.println("Clear ith bit = " + clear);

        int update = updateIthBit(n, i, 1);
        System.out.println("Update ith bit = " + update);

        int clearIB = clearIBit(n, i);
        System.out.println("Clear I Bit = " + clearIB);

        int clearRange = clearBitsinRange(n, 1, 3);
        System.out.println("Clear bits in range = " + clearRange);

        boolean powerOf2 = isPowerof2(n);
        System.out.println("Is power of 2 = " + powerOf2);

        int countSet = countSetBits(n);
        System.out.println("Count set bits = " + countSet);

        int countSet2 = countSetBits2(n);
        System.out.println("Count set bits (faster method) = " + countSet2);
    }
}