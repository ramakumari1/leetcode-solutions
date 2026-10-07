class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int n=nums.length;
       int sum=0;
       double avg=0;
       double ans=0;
       double avg1=0;
       for(int i=0;i<k;i++){
          sum+=nums[i];  
       }
       avg=(double)sum/k;
       for(int i=k;i<n;i++){
         sum+=nums[i];
         sum-=nums[i-k];
         avg1=(double)sum/k;
         avg=Math.max(avg,avg1);
       }
       return avg;
    }
}