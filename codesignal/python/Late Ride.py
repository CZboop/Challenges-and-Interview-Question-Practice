def solution(n):
    return sum([int(i) for i in "{}{}".format(n//60, n%60)])
