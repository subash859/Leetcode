class Solution {
    public int maxSubArray(int[] nums) {
        int sun = nums[0];
        int Max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            Max = Math.max(nums[i], Max + nums[i]);
            sun = Math.max(sun, Max);
        }

        return sun;
    }
}

