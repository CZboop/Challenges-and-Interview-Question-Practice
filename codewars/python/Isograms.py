def is_isogram(string):
    lst = []
    for i in string:
        if i.lower() not in lst:
            lst.append(i)
    return len(lst) == len(string)