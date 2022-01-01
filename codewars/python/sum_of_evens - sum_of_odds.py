def sum_difference(arr):
    x = sum(i for i in arr if i%2==0)
    y = sum(i for i in arr if i%2!=0)
    return x-y