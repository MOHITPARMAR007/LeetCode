class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int spaceIndex=0;// space wale ka index h yeh 
        int n = s.length(); // string ki length
        int m = spaces.length ; // space wale array ki length hai 
        for(int stringIndex = 0 ; stringIndex < n ;stringIndex++)
        {
            if(spaceIndex < m && spaces[spaceIndex] == stringIndex )
            {
                sb.append(' ');
                spaceIndex++;
            }
            sb.append(s.charAt(stringIndex));
        }
        return sb.toString();

        
    }
}