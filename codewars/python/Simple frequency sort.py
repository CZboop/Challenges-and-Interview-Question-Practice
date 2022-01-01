import collections
def solve(arr):
    counts= collections.Counter(arr)
    return sorted(arr, key=lambda x: (counts [x], -x) ,reverse=True)