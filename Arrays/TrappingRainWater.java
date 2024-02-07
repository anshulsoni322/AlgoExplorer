public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        int answer = trapWater(height);
        System.out.println(answer);
    }

    public static int trapWater(int[] height) {
        int n = height.length;
        
        // Edge case: If there are less than 3 bars, no water can be trapped
        if (n < 3) {
            return 0;
        }
        
        // Calculate left and right max boundaries
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        
        // Calculate the trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        
        return trappedWater;
    }
}
