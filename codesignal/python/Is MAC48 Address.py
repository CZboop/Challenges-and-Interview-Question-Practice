def solution(inputString):
    x = inputString.split("-")
    if len(x) == 6:
        for i in x:
            if len(i) != 2:
                return False 
            for j in i:
                if j not in "01234567890ABCDEF":
                    return False 
        return True 
    return False 
