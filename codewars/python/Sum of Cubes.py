def sum_cubes(n):
    count = 0
    for i in range(1,n+1):
        count+=i**3
    return count