from collections import deque

def solution(digits):
    n = len(digits)
    res = [deque(digits) for _ in range(n)]
    deque(map(lambda x: x[0].rotate(x[1]) , zip([j for j in res], [-i for i in range(n)])), 0)
    return [list(d) for d in res]
