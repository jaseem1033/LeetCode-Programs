class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = -1;
        if(target<nums[0]) return 0;
        if(target>nums[nums.length-1]) return nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(target>nums[i] && target<nums[i+1])
            {
                idx=i+1;
                break;
            }
        }
        return idx;
    }
}