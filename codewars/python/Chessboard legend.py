def grains(n):
    count= 0
    for i in range(1,n**2):
        count+=2**i
    return count+1