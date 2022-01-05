def solution(a):
    x = sum(i for i in a[::2])
    y = sum(i for i in a[1::2])
    return [x,y]
