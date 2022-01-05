def solution(inputArray):
    diff = 0
    for c,v in enumerate(inputArray[:-1]):
        for i,j in enumerate(inputArray[1:]):
            if c == i:
                if abs(v - j) > diff:
                    diff = abs(v - j)
    return diff 
