import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> res = new ArrayList<>();
    
    public List<String> letterCasePermutation(String s) {
        helper("", s);
        return res;
    }

    public void helper(String up, String p) {
        if (p.isEmpty()) {
            res.add(up);
            return;
        }
        
        char ch = p.charAt(0);
        
        // Recursive call including the character as is
        helper(up + ch, p.substring(1));
        
        // Recursive call with toggled case if it's a letter
        if (Character.isLetter(ch)) {
            helper(up + toggleCase(ch), p.substring(1));
        }
    }

    private char toggleCase(char ch) {
        return Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
    }
}
