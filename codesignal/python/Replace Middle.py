def solution(arr):
    if len(arr)%2 == 0:
        mid = arr[len(arr)//2-1] + arr[len(arr)//2]
        arr[len(arr)//2-1] = mid 
        arr.pop(len(arr)//2)  
    return arr 
