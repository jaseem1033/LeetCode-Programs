class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0]; 
        int prev2=nums[0];
        int prev1=Math.max(nums[0],nums[1]);
        int count=prev1;
        for(int i=2;i<nums.length;i++)
        {
            count=(Math.max(prev1,nums[i]+prev2));
            prev2=prev1;
            prev1=count;
        }
        return count;
    }
}