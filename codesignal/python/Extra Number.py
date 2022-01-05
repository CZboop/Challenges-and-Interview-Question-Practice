def solution(a, b, c):
    x = (a, b, c)
    return [i for i in x if x.count(i) == 1][0]

