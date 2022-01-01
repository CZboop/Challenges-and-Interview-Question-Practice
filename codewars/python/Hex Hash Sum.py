def hex_hash(code):
    x = [hex(ord(i)) for i in code]
    count = 0
    for i in x:
        for j in i:
            if j in "123456789":
                count+=int(j)
    return count