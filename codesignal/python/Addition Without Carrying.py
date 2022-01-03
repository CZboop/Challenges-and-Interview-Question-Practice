def solution(param1, param2):
    new = []
    for i, j in zip(str(param1)[::-1], str(param2)[::-1]):
        new.append((int(i)+int(j))%10)

    new = "".join(str(i) for i in new[::-1])
    param1, param2 = str(param1), str(param2)

    if len(param1)!=len(param2):
        new = max(param1, param2, key=len)[:abs(len(param1)-len(param2))] + new 
        
    return int(new)

