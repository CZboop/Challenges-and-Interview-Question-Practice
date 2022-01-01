class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> indMap = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            if (indMap.containsKey(target - nums[i])){
                ans[0] = i;
                ans[1] = indMap.get(target - nums[i]);
            }
            indMap.put(nums[i], i);
        }
        return ans;
    }
}