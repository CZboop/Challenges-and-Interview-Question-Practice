def number(lines):
    new=[]
    for count,val in enumerate(lines):
        new.append("{}: {}".format(count+1,val))
    return new