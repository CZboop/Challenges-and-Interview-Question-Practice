import math
def smallest(n):
    count = 1
    for i in range(1,n+1):
        count = int((count*i)/math.gcd(count,i))
    return count 