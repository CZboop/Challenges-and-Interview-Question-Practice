def solution(n, firstNumber):
    if firstNumber > n/2:
        return firstNumber - n/2
    elif firstNumber < n/2:
        return firstNumber + n/2
    elif firstNumber == 0:
        return n-1
    else:
        return 0