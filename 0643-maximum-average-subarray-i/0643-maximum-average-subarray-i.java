class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum=0;
       double avg=0;
       int n=nums.length;
       if(n==1){
        return (double)nums[0];
       }
       for(int i=0;i<k;i++){
        sum += nums[i];
        avg = (double)sum/k;
       } 
       double maxi=avg;
       double max=avg;
       for(int i=k;i<n;i++){
        sum += nums[i]-nums[i-k];
        avg = (double)sum/k;
        maxi=Math.max(maxi,avg);
        
       }
       return maxi;
    }
}