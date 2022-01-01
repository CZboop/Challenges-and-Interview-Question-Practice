class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        return sorted(nums, key= lambda x: nums.count(x))[0]