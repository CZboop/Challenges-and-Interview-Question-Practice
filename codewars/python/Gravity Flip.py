def flip(d, a):
    if d=="L":
        return sorted(a,reverse=True)
    if d=="R":
        return sorted(a,reverse=False)