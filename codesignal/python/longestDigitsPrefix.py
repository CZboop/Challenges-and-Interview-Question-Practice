def solution(inputString):
    x = ""
    for i in inputString:
        if i.isdigit():
            x += i
        else:
            return x
    return x
