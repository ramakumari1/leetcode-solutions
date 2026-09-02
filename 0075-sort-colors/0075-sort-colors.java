class Solution{
    public void sortColors(int[] nums){
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            int j=n-1;
            while(i<j){ 
               if(nums[i]>nums[j] ){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
               }
               j--;
                
            }
        }
        
    }
}
