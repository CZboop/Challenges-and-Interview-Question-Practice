import math

def solution(a):
    new = []
    for i in a:
        new.append(math.prod([int(j) for j in str(i)]))
    return len(set(new))
