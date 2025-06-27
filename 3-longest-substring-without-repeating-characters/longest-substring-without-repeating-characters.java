class Solution {
    public int lengthOfLongestSubstring(String s) {
          int max = 0;
        String sub = "";
        
        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));
            if (sub.contains(ch)) {
                sub = sub.substring(sub.indexOf(ch) + 1);
            }
            sub += ch;
            max = Math.max(max, sub.length());
        }
        
        return max;
    }
}