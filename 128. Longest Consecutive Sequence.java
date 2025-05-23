class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) {
        return 0;
        }

        int count =0;
        int longest = 1;
        Arrays.sort(nums);
        int lastSmaller =  Integer.MIN_VALUE;

        for(int i = 0; i< nums.length; i++) {
            if (nums[i] - 1 == lastSmaller) {
                 count += 1;
                 lastSmaller = nums[i];
            } else if (nums[i] != lastSmaller) {
                count = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
