def solution(inputArray):
    num = min(0, min(inputArray)*100)
    for c,v in enumerate(inputArray):
        for i,j in enumerate(inputArray[1:]):
            if c == i:
                if v * j > num: 
                    num = v * j
    return num
