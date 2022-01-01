def median(arr):
    arr=sorted(arr)
    if len(arr)%2==0:
        return (arr[int((len(arr))/2)-1]+arr[int((len(arr))/2)])/2
    else:
        return arr[int((len(arr))/2)]