def find_longest(string):
    spl = string.split()
    new = []
    for i in spl:
        new.append(len(i))
    return max(new)