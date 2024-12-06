class Solution {
    public boolean canPlaceFlowers(int[] fls, int n) {
        int count = 0;
        int len = fls.length;
        
        for (int i = 0; i < len; i++) {
            // Check if current plot is empty and neighbors (if exist) are also empty
            if (fls[i] == 0 && (i == 0 || fls[i - 1] == 0) && (i == len - 1 || fls[i + 1] == 0)) {
                fls[i] = 1; // Plant a flower
                count++; // Increment count of planted flowers
                
                if (count >= n) {
                    return true; // Return true if required flowers are planted
                }
                i++; // Skip the next plot
            }
        }
        return count >= n; // Check if enough flowers were planted
    }
}
