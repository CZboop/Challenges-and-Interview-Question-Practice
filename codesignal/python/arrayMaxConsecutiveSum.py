def solution(inputArray, k):
    x = sum(inputArray[:k])
    y = x
    for i in range(len(inputArray)-k):
        x +=  inputArray[i+k] -inputArray[i]
        y = max(x,y)
    return y
    