def count_languages(lst): 
    x = {}
    y = [i.get("language") for i in lst]
    for i in y:
        x[i] = y.count(i)
    return x