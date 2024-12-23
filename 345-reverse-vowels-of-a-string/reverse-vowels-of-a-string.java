class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        int start = 0;
        int end = len - 1;
        char[] ch = s.toCharArray();
        
        while (start < end) {
            if (!isVowel(ch[start])) {
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            } else {
                // Swap the vowels
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch); // Convert char array back to String
    }

    public static boolean isVowel(char ch) {
        // Use `||` for checking multiple conditions and correct comparison with characters
        return ch == 'a' || ch == 'A' || 
               ch == 'e' || ch == 'E' || 
               ch == 'i' || ch == 'I' || 
               ch == 'o' || ch == 'O' || 
               ch == 'u' || ch == 'U';
    }
}
