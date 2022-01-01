def filter_string(string):
    x = []
    for i in string:
        try:
            x.append(int(i))
        except:
            pass
    return int("".join(str(i) for i in x))