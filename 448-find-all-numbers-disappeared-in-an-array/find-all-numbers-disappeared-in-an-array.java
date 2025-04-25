class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int arr[]=new int[nums.length+1];
        for(int num:nums)
        arr[num]++;
        List<Integer>lt=new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0)
            lt.add(i);
        }
        return lt;
    }
}