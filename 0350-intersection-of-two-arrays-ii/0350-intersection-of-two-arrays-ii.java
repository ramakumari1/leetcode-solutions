class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

       
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] arr = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        
        for (int num : nums2) {

            if (map.getOrDefault(num, 0) > 0) {

                arr[index] = num;
                index++;

                map.put(num, map.get(num) - 1);
            }
        }

       
        int[] result = new int[index];

        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}