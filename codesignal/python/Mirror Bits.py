def solution(a):
    x = "{0:b}".format(a)
    return int(x[::-1], 2)
