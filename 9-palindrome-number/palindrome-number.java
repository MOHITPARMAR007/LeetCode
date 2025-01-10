class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            // Get the last digit of the number
            int digit = x % 10;
            // Build the reversed number
            reversed = reversed * 10 + digit;
            // Remove the last digit from the number
            x /= 10;
        }

        // Check if the reversed number is the same as the original
        return original == reversed;
    }
}
