class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxi=0;
        int hei=0;
        while(i<j){
            int area=(j-i)*Math.min(height[i],height[j]);
            maxi=Math.max(maxi,area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
            

        }
        return maxi;
    }
}