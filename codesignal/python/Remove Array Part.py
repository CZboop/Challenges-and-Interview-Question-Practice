def solution(inputArray, l, r):
    inputArray = inputArray[:l] + inputArray[r+1:]
    return inputArray
