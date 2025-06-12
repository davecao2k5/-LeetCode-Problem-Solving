
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int max=0;
        Map<Character, Integer> r= new HashMap<>();
        r.put('I',1);
        r.put('V',5);
        r.put('X',10);
        r.put('L',50);
        r.put('C',100);
        r.put('D',500);
        r.put('M',1000);
        for(int i=s.length()-1;i>=0;i--){
            if(r.get(s.charAt(i))>=max){
                max=r.get(s.charAt(i));
                sum=sum+r.get(s.charAt(i));
            }else if(r.get(s.charAt(i))<max){
                sum=sum-r.get(s.charAt(i));
            }
        }
        return sum;
    }
}