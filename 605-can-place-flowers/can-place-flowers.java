class Solution {
    public boolean canPlaceFlowers(int[] fls, int n) {
        int count = 0;
        int len = fls.length;

        if (n == 0) {
            return true;
        }

        for (int i = 0; i < len; i++) {
            if (fls[i] == 0 && (i == 0 || fls[i - 1] == 0) && (i == len - 1 || fls[i + 1] == 0)) {
                fls[i] = 1; // Mark the spot as planted
                count++;
                if (count == n) {
                    return true;
                }
            }
        }
        return false;
    }
}
