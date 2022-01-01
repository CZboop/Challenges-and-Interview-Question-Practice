def find_deleted_number(arr, mixed_arr):
    for i in arr:
        if i not in mixed_arr:
            return i
    return 0