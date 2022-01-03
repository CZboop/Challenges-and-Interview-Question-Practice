def solution(k):
    red = sum([i**2 for i in range(2, k+1, 2)])
    yellow = sum([i**2 for i in range(1, k+1, 2)])
    return red - yellow
