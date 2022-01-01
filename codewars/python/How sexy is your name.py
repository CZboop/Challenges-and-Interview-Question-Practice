def sexy_name(name):
    count = 0
    for i in name.upper():
        if i.isalpha():
            count+=SCORES.get(i)
    if count<=60:
        return 'NOT TOO SEXY'
    elif 61 <= count <= 300: 
        return 'PRETTY SEXY'
    elif 301 <= count <= 599:  
        return 'VERY SEXY'
    elif count >= 600:  
        return 'THE ULTIMATE SEXIEST'