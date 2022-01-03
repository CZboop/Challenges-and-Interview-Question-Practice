import numpy as np

def solution(matrix, a, b):
    matrix = np.array(matrix)
    count = 0
    for i in matrix[a, :]:
        count += i
    for i in matrix[:, b]:
        count += i
    count -= matrix[a, b]
    return count 
