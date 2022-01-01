def remove_duplicate_words(s):
    x = s.split(" ")
    y= []
    for i in x:
        if i not in y:
            y.append(i)
    return " ".join(y)