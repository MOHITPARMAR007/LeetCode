class Solution {
    public static boolean closeStrings(String word1, String word2) {
        // Check if the lengths of the two words are different
        if (word1.length() != word2.length()) {
            return false;
        }

        // Arrays to store the frequency of each character
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Populate the frequency arrays
        for (int i = 0; i < word1.length(); i++) {
            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;
        }

        // Check if both words have the same set of characters
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] > 0 && freq2[i] == 0) || (freq2[i] > 0 && freq1[i] == 0)) {
                return false;
            }
        }

        // Sort frequency arrays to compare frequencies
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // Check if the sorted frequency arrays are equal
        return Arrays.equals(freq1, freq2);
    }
}
