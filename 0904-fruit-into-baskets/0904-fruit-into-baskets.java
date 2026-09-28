class Solution {
    public int totalFruit(int[] fruits) {
        int j=0;
        int n=fruits.length;
        int maxi=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2){
                map.put(fruits[j],map.get(fruits[j])-1);
              if(map.get(fruits[j])==0){
                map.remove(fruits[j]);
              }
                j++;
            }
            
            maxi=Math.max(maxi,i-j+1); 
        }
        
        return maxi;   
    }
}