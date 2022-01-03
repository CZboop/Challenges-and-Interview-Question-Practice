def solution(time):
    x = time.split(":")
    if x[0][0]=="2":
        if int(x[0][1])>3:
            return False
    if int(x[1][0])>5:
        return False 
    return True
