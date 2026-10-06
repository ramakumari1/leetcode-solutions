class Solution {
    public int[] twoSum(int[] numbers, int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=numbers.length;
        int l=0;
        
        for(int i=0;i<n;i++){
            if(!map.containsKey(target-numbers[i])){
                map.put(numbers[i],i);
                
            }
            else{
                l=map.get(target-numbers[i]);
                return new int[]{l+1,i+1};      
            }
        }
        return new int[]{};
        
    }
}
