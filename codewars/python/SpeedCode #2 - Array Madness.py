def array_madness(a,b):
    a_ = 0
    b_ = 0
    for i in a:
        a_ += i**2
    for x in b:
        b_ += x**3
    return a_>b_