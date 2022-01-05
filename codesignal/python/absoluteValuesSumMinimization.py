def solution(a):
    diffs = {}
    for i in a:
        x = 0
        for j in a:
            x += abs(j - i)
        diffs[i] = x
    return min(diffs, key = diffs.get)
