class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int ele : nums) {
            if (i < 2 || nums[i - 2] != ele) {
                nums[i] = ele;
                i++;
            }
        }
        return i;
    }
}
