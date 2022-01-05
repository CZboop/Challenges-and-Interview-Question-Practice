def solution(inputArray):
    x = max(inputArray, key= len)
    return [i for i in inputArray if len(i) == len(x)]
