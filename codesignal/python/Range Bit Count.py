def solution(a, b):
    new = []
    for i in range(a,b+1):
        new.append("{0:b}".format(i))
    new = "".join(new)
    return new.count("1")
