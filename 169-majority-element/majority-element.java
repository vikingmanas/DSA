class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int r=0;
        for(int i :nums){
            if(c==0){
                r=i;
            }
            if(i==r){
                c++;
            }else{
                c--;
            }
        }
        return r;
    }
}