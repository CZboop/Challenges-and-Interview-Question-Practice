def clean_string(s):
    new = []
    for i in s:
        if i=="#" and new:
            new.pop()
        else:
            new.append(i)
    return "".join(new).replace("#","")