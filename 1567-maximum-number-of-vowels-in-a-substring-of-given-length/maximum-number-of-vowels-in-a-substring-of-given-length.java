class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;  // To count vowels in the current window
        int maxVowels = 0;  // To store the maximum number of vowels
        
        // Initial window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        maxVowels = count;
        
        // Sliding window
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;  // Add the next character in the window
            }
            if (isVowel(s.charAt(i - k))) {
                count--;  // Remove the character that's sliding out of the window
            }
            maxVowels = Math.max(maxVowels, count);
        }
        
        return maxVowels;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
