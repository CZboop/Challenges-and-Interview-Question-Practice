def solution(maxLength, text):
    stripped = []
    for i in text.split(" "):
        temp = ''
        for j in i:
            if j.isalpha():
                temp+=j 
        if len(temp)>0:
            stripped.append(temp)
    return len([i for i in stripped if len(i)<=maxLength])

