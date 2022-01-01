def sum_array(arr=[0]):
    if arr==None or len(arr)<=2:
        return 0
    else:
        return sum(arr) - min(arr)-max(arr)