def solution(inputString):
    octs = [i for i in inputString.split(".") if i.isdigit()]
    for i in octs:
        if i[0] == '0' and len(i) != 1:
            octs.remove(i)
    return inputString.count(".") == 3 and all(0<=int(i) <= 255 for i in octs) and len(octs) == 4
