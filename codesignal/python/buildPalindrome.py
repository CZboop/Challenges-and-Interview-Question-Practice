def solution(st):
    if st==st[::-1]:
        return st

    dromes = []
    for i in range(len(st)):
        temp = st + st[i::-1]
        if  temp == temp[::-1]:
            dromes.append(temp)
            
    return min(dromes, key=len)
