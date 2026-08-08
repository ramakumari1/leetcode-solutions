class Solution{
    public int firstMissingPositive(int[] arr) {
        int start=0;

        while (start<arr.length) {
            int correct = arr[start]-1;

            if (arr[start]>0 && arr[start]<=arr.length && arr[start]!=arr[correct]){
                int temp = arr[start];
                arr[start] = arr[correct];
                arr[correct] = temp;
            } else {
                start++;
            }
        }

        for (int i=0;i< arr.length;i++) {
            if (arr[i]!=i+1) {
                return i+1;
            }
        }

        return arr.length+1;
    }
}