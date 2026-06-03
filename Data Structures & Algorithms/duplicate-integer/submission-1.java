class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        boolean result = false;
        for (int i=0; i<nums.length;i++) {
            if (!elements.add(nums[i])) {
                result = true;
                break;
            }
        }
        return result;
    }
}