class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target) {
                return mid;
            }
            //left half
            else if (nums[low] <= nums[mid]) {
                //finding sorted part
                if(nums[low]<= target && target < nums[mid]) {
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            //right half
            else{
                //finding sorted part
                if(nums[mid] < target && target <= nums[high]){
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
        }

        return -1;
        
    }
}
