class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder(); // Temporary space to store compressed result
        int count = 1;
        int i = 1; // Start from the second character
        
        // Append the first character to the StringBuilder
        sb.append(chars[0]);
        
        while (i < chars.length) {
            if (chars[i] == chars[i - 1]) {
                // Increment count if the current character matches the previous one
                count++;
            } else {
                // If the group ends and count > 1, append the count
                if (count > 1) {
                    sb.append(count);
                }
                // Append the current character to start a new group
                sb.append(chars[i]);
                count = 1; // Reset count for the new group
            }
            i++;
        }
        
        // Handle the last group (if count > 1, append the count)
        if (count > 1) {
            sb.append(count);
        }
        
        // Overwrite the input array with the compressed result
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        
        return sb.length();
    }
}
