class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr=new int[Math.min(nums1.length,nums2.length)];
        HashMap<Integer,Integer>map=new HashMap<>();
        int index=0;
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                arr[index]=nums2[i];
                index++;
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        return Arrays.copyOf(arr,index);
    
    }
}