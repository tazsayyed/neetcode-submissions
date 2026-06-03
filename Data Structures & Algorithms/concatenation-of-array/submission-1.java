class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = Arrays.copyOf(nums, n * 2);
        for (int i = 0; i < n; i++) {
            ans[n+i] = nums[i];
        }
        return ans;
    }
}