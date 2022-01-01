def solution(stones):
    count = 0
    for c,v in enumerate(stones[:-1]):
        if v==stones[c+1]:
            count+=1
    return count