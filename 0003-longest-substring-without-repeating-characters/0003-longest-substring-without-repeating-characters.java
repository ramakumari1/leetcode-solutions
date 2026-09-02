class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n=s.length();
      int i=0;
      int j=0;
      int maximum=0;
      HashMap<Character,Integer>map=new HashMap<>();
      while(j<n){
      if(!map.containsKey(s.charAt(j))){
        map.put(s.charAt(j),1);
        j++;
      }
      else{
        map.remove(s.charAt(i));
        i++;
      }
      maximum=Math.max(maximum,j-i);
      }
      return maximum;
    }
     
}