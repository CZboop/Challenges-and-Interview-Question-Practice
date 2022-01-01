import math
def diamond(n):
    x=""
    if n%2!=0 and n>0:
        for i in range(1,n+1):
            if i <= math.ceil(n/2):
                x+="{}{}\n".format(" "*int(((n-(i+i-1))/2)),"*"*(i+i-1))
            else:
                x+="{}{}\n".format(" "*int(((n-(2*n-2*i+1))/2)),"*"*(2*n-2*i+1))
        return x
    else:
        return None