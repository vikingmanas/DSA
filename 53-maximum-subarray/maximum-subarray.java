class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int cur = 0;
        for (int k : nums) {
            if(cur<0)
            cur=0;
            cur = cur + k;
            max = Math.max(max, cur);
        }
        return max;
    }
}
