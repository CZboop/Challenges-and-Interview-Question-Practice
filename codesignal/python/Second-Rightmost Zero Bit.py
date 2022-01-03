def solution(n):
    return 2**[c for c,v in enumerate("{0:b}".format(n)[::-1]) if v=="0"][1]
