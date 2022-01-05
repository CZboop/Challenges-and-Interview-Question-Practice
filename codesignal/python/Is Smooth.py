def solution(arr):
    if len(arr)%2 == 0:
        mid = int(arr[int(len(arr)//2)-1]) + int(arr[len(arr)//2])
    else:
        mid = arr[len(arr)//2]
    return arr[0] == mid == arr[-1]
