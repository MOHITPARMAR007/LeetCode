class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0 ;
        int n = words.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String str1 = words[i];
                String str2 = words[j];

                // Check if str1 is a prefix and suffix of str2
                if (str2.length() >= str1.length()) {
                    String prefix = str2.substring(0, str1.length());
                    String suffix = str2.substring(str2.length() - str1.length());
                    if (str1.equals(prefix) && str1.equals(suffix)) {
                        count++;
                    }
                }
            }
        }
        return count ;
        
    }
}