def solution(n):
    return [[0] * (j + 1) for j in range(0, n)] + [[0] * (j) for j in range(n-1, 0, -1)] 
