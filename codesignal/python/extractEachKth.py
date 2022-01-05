def solution(inputArray, k):
    new = []
    for c,v in enumerate(inputArray):
        if (c+1) % k != 0:
            new.append(v) 
    return new
