def order(sentence):
    x = sentence.split(" ")
    d = {}
    for i in x:
        for j in i:
            if j in "1234567890":
                d[j]=i
    x = ""
    for key in sorted(d):
        x+=d[key]+" "
    return x.strip()