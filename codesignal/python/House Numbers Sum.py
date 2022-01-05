def solution(inputArray):
    count = 0
    for i in inputArray:
        count += i
        if i == 0:
            break
    return count 