class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n=s.length();
      int count=0;
      
      for(int i=0;i<n;i++){
        int j=i;
        HashSet<Character>set=new HashSet<>();
        while(j<n && !set.contains(s.charAt(j))){
            set.add(s.charAt(j));
            j++;
        }
        count=Math.max(count,j-i);
      }
      return count;
    }
     
}