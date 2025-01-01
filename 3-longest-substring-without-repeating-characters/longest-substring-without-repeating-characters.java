class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int windowEnd = 0;
        int n = s.length();
        int len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while (windowEnd < n) {
            char ch = s.charAt(windowEnd);
            
            if (map.containsKey(ch) && map.get(ch) >= windowStart) {
                windowStart = map.get(ch) + 1;
            }
            
            map.put(ch, windowEnd);
            len = Math.max(len, windowEnd - windowStart + 1);
            windowEnd++;
        }

        return len;
    }
}
