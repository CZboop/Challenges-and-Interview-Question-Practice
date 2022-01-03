def solution(n):
    new = []
    while n>0:
        new.append(sum(int(i) for i in str(n)))
        n-= sum(int(i) for i in str(n))
    new = sorted(new, reverse=True)
    return max(new, key=lambda x: new.count(x))
        