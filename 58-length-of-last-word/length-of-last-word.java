class Solution {
    public int lengthOfLastWord(String s) {
        String regex=" ";
        String [] Arraystring= s.split(regex);
        int last=Arraystring[Arraystring.length-1].length();
        return last;
    }
}