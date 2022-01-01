def jumping_number(number):
    n=[ int(i) for i in str(number)]
    if len(n)==1:
        return "Jumping!!"
    elif all(abs(i-j)==1 for i,j in zip(n,n[1:])):
        return "Jumping!!"
    else:
        return "Not!!"