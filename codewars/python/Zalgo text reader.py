def read_zalgo(zalgotext):
    x = [i for i in zalgotext if i.isalnum()==True or i in " .!,?"]
    return "".join(x)