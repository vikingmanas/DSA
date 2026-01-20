class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int i : nums) total+=i;
        if(total % 2!=0)return false;
        int sum= total/2;

        boolean[] dp=new boolean[sum+1];

        dp[0]=true;

        for(int i : nums){
            for(int curr=sum;curr>=i;curr--){
                dp[curr]=dp[curr]|| dp[curr-i];
                if(dp[sum])return true;
            }
        }
        return dp[sum];
    }
}