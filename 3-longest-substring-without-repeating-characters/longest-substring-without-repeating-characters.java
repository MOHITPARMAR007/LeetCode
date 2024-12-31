class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = 0; // Keeps track of the current substring size
        int maxSize = 0; // Tracks the overall maximum size
        HashSet<Character> set = new HashSet<>();
        
        int start = 0; // Start index of the sliding window
        
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            
            // If duplicate is found, shrink the window
            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
                size--; // Adjust size as we shrink the window
            }
            
            // Add the current character to the set and update size
            set.add(ch);
            size++;
            
            // Update maxSize if needed
            maxSize = Math.max(maxSize, size);
        }
        
        return maxSize;
    }
}
