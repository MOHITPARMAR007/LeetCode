class Solution {
    public int maxPower(String s) {
        int max = 0;
        int temp = 1;
        char[] ch = s.toCharArray();

        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == ch[i - 1]) {
                temp++;
            } else {
                max = Math.max(max, temp);
                temp = 1;
            }
        }

        max = Math.max(max, temp);

        return max; 
    }
}
