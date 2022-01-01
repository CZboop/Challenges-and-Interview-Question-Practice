def is_prime(num):
    if num<=3:
        return num>1
    if num%2==0 or num%3==0:
        return False
    x = 5
    while x**2<=num:
        if num%x==0 or num%(x+2)==0:
            return False
        x+=6
    return True