class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        Map<Character, Character> closecheck=new HashMap<Character,Character>();
        closecheck.put(')','(');
        closecheck.put(']','[');
        closecheck.put('}','{');
      
       if(s.equals("")) return false;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
            st.push(s.charAt(i));
        }else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
            if(st.isEmpty()==true){
                return false;
            }else if(closecheck.get(s.charAt(i))==st.peek()){
                st.pop();
            }else return false;
        }
       }
       if(st.isEmpty()==true){
        return true;
       } else return false;
    }
}