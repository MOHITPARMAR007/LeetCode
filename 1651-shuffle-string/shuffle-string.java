class Solution {
    public String restoreString(String s, int[] indices) {
        // Initialize a StringBuilder with the length of the input string
        StringBuilder finalString = new StringBuilder(s.length());

        // Initialize the StringBuilder with spaces or any placeholder character
        for (int i = 0; i < s.length(); i++) {
            finalString.append(' ');
        }

        // Place each character at the correct position
        for (int i = 0; i < indices.length; i++) {
            finalString.setCharAt(indices[i], s.charAt(i));
        }

        return finalString.toString();
    }
}
