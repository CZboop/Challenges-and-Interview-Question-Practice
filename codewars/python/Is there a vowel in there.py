def is_vow(inp):
    new = []
    for i in inp:
        if i in [97,101,105,111,117]:
            new.append(chr(i))
        else:
            new.append(i)
    return new