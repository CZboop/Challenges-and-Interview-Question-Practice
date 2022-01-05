import math
def solution(n):
    x = 0
    while math.factorial(x) < n:
        x += 1
    return math.factorial(x) 