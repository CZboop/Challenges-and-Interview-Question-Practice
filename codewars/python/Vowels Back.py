def vowel_back(st):
    new = ''
    for i in st:
        if i in 'co':
            x = chr((ord(i)-1))
        elif i =='d':
            x = chr((ord(i)-3))
        elif i =='e':
            x = chr((ord(i)-4))
        elif i in 'aeiou':
            x = chr((ord(i)-5))
        else:
            x = chr((ord(i)+9)) 
        if ord(x)>122:
            x = chr((ord(x)-26))
        if ord(x)<97:
            x = chr((ord(x)+26))
        if x not in 'code':
            new+=x
        else:
            new+=i
    return new