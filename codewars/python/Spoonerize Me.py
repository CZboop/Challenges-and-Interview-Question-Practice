def spoonerize(words):
    split1 = words.split(" ")[0][0]
    split2 = words.split(" ")[1][0]
    x= words.replace(split1,split2,1).split(" ")[0]
    y = words.split(" ")[1]
    y = y.replace(split2,split1,1)
    return x+" "+y