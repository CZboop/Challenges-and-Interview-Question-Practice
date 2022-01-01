def evil(n):
    x = bin(n).lstrip("0b")
    y= x.count("1")
    return "It's Odious!" if y%2!=0 else "It's Evil!"