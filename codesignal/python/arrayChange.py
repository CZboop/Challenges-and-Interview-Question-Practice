def solution(inputArray):
    count = 0
    new = [inputArray[0]]
    for i in inputArray[1:]:
        if new[-1]<i:
            new.append(i)
        else:
            new.append((new[-1]+1))
            count+=(new[-1]-i)
    return count

