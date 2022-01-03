def solution(inputArray):
    for i in range(1,max(inputArray)):
        if all(j%i!=0 for j in inputArray):
            return i
    return max(inputArray)+1