import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count the frequency of each number
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int result = -1;

        // Step 2: Check if any number is "lucky"
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                result = Math.max(result, key);  // We want the largest lucky number
            }
        }

        return result;
    }
}
