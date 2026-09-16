class Solution {
    public String reverseWords(String s) {
        StringBuilder st=new StringBuilder();
        int n=s.length();
        int i=n-1;
        while(i>=0){
            while(i>=0  && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int end=i;
            while(i>=0 && s.charAt(i)!=' ' ){
                i--;
            }
            if(st.length()>0){
                st.append(' ');
            }
            st.append(s.substring(i+1,end+1));
        }
        return st.toString();
        
    }
}