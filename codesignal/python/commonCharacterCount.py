def solution(s1, s2):
    x = 0
    for i in set(s1):
        if i in s2:
            x += min(s1.count(i), s2.count(i))
    return x 