def solution(inputString):
    return "".join("a" if i=="z" else chr((ord(i) + 1)) for i in inputString )
