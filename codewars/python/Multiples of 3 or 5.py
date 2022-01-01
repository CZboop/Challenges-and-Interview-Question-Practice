def solution(x):
    l = [i for i in range(x) if i%3==0 or i%5==0]
    return sum(l)