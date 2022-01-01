def stringy(size):
    new= ""
    for i in range(size):
        if i%2==0:
            new+="1"
        else:
            new+="0"
    return new