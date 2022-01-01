def replace_exclamation(s):
    v = ["a","e","i","o","u"]
    for i in s:
        if i.lower() in v:
            s= s.replace(i,"!")
    return s