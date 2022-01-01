def automorphic(n):
    x=str(n**2)
    y=str(n)
    if x[-len(y)] == y[-len(y)]:
        return "Automorphic"
    else:
        return "Not!!"