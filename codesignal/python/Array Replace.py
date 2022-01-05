def solution(inputArray, elemToReplace, substitutionElem):
    for c,i in enumerate(inputArray):
        if i == elemToReplace:
            inputArray[c] = substitutionElem
    return inputArray
