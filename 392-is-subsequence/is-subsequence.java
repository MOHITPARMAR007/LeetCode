class Solution {
    public boolean isSubsequence(String s, String t) {
        int smallString = 0; // Pointer for string 's'
        int largeString = 0; // Pointer for string 't'
        
        // Traverse through 't'
        while (largeString < t.length()) {
            // If all characters of 's' are matched
            if (smallString == s.length()) return true;
            
            // Check if the characters match
            if (s.charAt(smallString) == t.charAt(largeString)) {
                smallString++; // Move pointer in 's'
            }
            largeString++; // Always move pointer in 't'
        }
        
        // Check if all characters of 's' were matched
        return smallString == s.length();
    }
}
