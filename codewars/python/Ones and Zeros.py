def binary_array_to_number(arr):
    arr=[str(i) for i in arr]
    x = "".join(arr)
    return int(x,2)