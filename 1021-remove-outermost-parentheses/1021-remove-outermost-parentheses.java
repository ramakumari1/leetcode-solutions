class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int count=0;
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count>0){
                    st.append(s.charAt(i));
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    st.append(s.charAt(i));
                }
            }
        }
        return st.toString();
  
    }
}