def solve(nums,div):
    return list(i+i%div for i in nums)