def solution(inputString):
    d = {}
    alphabet = 'abcdefghijklmnopqrstuvwxyz'

    if sorted(set(inputString))[-1]!=alphabet[len(set(inputString))-1]:
        return False

    for i in alphabet:
        if len(d)==0 and inputString.count(i)==0:
            return False
        d[i]= inputString.count(i)

    d = {k:v for k, v in d.items() if v!=0}
    
    return str(d) == str(dict(sorted(d.items(), key=lambda item: item[1], reverse=True)))

