def first_non_consecutive(arr):
    for i in arr[1:]:
        if i-1 != arr[arr.index(i)-1]:
            return i