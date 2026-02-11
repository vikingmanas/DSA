class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        int max=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            while(nums[i]-nums[k]>1){
                k++;
            }
            if(nums[i]-nums[k]==1){
                max=Math.max(max,i-k+1);
            }
        }
        
        return max;
    }
}