class Solution {
    public int maxSubArray(int[] nums) {
        int curMax=nums[0];
        int Max=nums[0];
        for (int i=1;i<nums.length;i++){
            curMax=Math.max(nums[i], nums[i]+curMax);
            Max=Math.max(curMax,Max);
        }
        return Max;
    }
}