import numpy as np

def solution(matrix):
    arr = np.array(matrix)
    count = 0
    for i in range(len(arr[0])):
        for j in arr[:,i]:
            if j!=0:
                count+=j
            else:
                break
    return count 
