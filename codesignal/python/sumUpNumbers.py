import re 

def solution(inputString):
    x = re.findall('([0-9]+)', inputString)
    x = [int(i) for i in x]
    return sum(x)

