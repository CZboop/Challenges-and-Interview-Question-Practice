def reverse_alternate(string):
    x = string.split(" ")
    x = [i for i in x if i and i!=" "]
    #return x
    new = []
    for c,i in enumerate(x):
        if c%2!=0:
            new.append(i[::-1])
        else:
            new.append(i)     
    return " ".join((" ".join(new)).split())