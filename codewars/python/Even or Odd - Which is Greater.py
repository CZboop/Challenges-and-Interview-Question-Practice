def even_or_odd(s):
    odd = 0
    even = 0
    for i in s:
        if int(i)%2==0:
            even+=int(i)
        if int(i)%2!=0:
            odd+=int(i)
    if even>odd:
        return "Even is greater than Odd"
    elif odd>even:
        return "Odd is greater than Even"
    else:
        return "Even and Odd are the same"