def is_triangle(a, b, c):
    for i in [a,b,c]:
        if sum([a,b,c]) - i <= i:
            return False
    return True