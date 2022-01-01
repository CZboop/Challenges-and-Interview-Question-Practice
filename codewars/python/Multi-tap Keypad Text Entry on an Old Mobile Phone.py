def presses(phrase):
    count = 0
    for i in phrase.upper():
        if i in "ADGJMPTW 1*#":
            count+=1
        if i in "BEHKNQUX0":
            count+=2
        if i in "CFILORVY":
            count+=3
        if i in "SZ234568":
            count+=4
        if i in "79":
            count+=5
    return count