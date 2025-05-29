class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        int n = nums.length;

        Set<List<Integer>> ans = new HashSet<>();

        for (int si = 0; si < n - 3; si++) {
            for (int ei = si + 1; ei < n - 2; ei++) {
                int left = ei + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[si] + nums[ei] + nums[left] + nums[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[si], nums[ei], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }
}
