def no_repeat(string):
    for i in string:
        if string.count(i)==1:
            return i