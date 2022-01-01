def abbrev_name(name):
    names = name.split(" ")
    ab = []
    for i in names:
        ab.append(i[0].upper())
    ab = ".".join(ab)
    return ab