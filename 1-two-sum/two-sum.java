class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int k=target-nums[i];
            if(hash.containsKey(k)){
            return new int[]{hash.get(k),i};
            }
            hash.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}