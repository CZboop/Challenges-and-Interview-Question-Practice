def prev_mult_of_three(n):
    while int(n)%3!=0:
        if len(str(n))==1:
            break
        n = str(n)[:-1]
    return int(n) if int(n)%3==0 else None