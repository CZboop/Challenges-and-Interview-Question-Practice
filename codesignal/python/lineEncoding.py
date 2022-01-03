from itertools import groupby

def solution(s):
    x =["".join(i) for j, i in groupby(s)]
    string = ""
    for i in x:
        if len(i)==1:
            string += i[0]
        else:
            string += str(len(i)) + i[0]
    return string 
