from math import gcd

def solution(denominators):
    return functools.reduce( lambda i,j : abs(i*j) // math.gcd(i, j), denominators)
