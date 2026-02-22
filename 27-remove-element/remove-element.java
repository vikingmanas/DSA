class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int j=nums[i];
            if(j!=val){
                nums[count]=j;
                count++;
            }
        }
        return count;
    }
}