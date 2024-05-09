class Solution {
    public int findPeakElement(int[] nums) {
        
        // edge case
        if(nums.length == 1) return 0;

        int n = nums.length;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;

        int start = 1;
        int end = n - 2;
        int mid = 0;

        while(start < end){
          mid  = (start + end) / 2;
          if(nums[mid] < nums[mid+1]) start = mid + 1;
          else end = mid;
        }

        return start;
    }
}