class Solution {
    public int strStr(String haystack, String needle) {
        int word=needle.length();
        int res=-1;
        for(int i=0;i<haystack.length();i++){
            if(i>haystack.length()-word) {
                res=-1;
                break;
            }else if(needle.equalsIgnoreCase(haystack.substring(i,i+word))==true){
                res=i;
                break;
            } 
        }
        return res;
    }
}