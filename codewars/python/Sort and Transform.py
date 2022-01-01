def sort_transform(arr):
    new1 = "".join([chr(arr[0]),chr(arr[1]),chr(arr[-2]),chr(arr[-1])])
    arr = sorted(arr)
    new2 = "".join([chr(arr[0]),chr(arr[1]),chr(arr[-2]),chr(arr[-1])])
    arr = sorted(arr, reverse=True)
    new3 = "".join([chr(arr[0]),chr(arr[1]),chr(arr[-2]),chr(arr[-1])])
    arr = sorted([chr(i) for i in arr])
    new4 = "".join([arr[0],arr[1],arr[-2],arr[-1]])
    array = [new1,new2,new3,new4]
    return "-".join(array)