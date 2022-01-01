def perimeter(n):
    sides = [1,1]
    for i in range(n-1):
        sides.append(sum(sides[-2:]))
    return sum(sides)*4