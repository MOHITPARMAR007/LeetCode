class Solution {
    public int compress(char[] chars) {
        int write = 0;  // Pointer to write the compressed characters
        int read = 0;   // Pointer to read through the array
        
        while (read < chars.length) {
            char currentChar = chars[read];  // The current character being processed
            int count = 0;
            
            // Count the occurrences of the current character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            // Write the character
            chars[write++] = currentChar;
            
            // If the count is greater than 1, write the count as well
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        
        // Return the new length of the compressed array
        return write;
    }
}
