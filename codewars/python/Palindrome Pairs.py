def palindrome_pairs(words):
    list = []
    for c,v in enumerate(words):
        for j,k in enumerate(words):
            if str(v)+str(k)==(str(v)+str(k))[::-1]:
                if c!=j:
                    list.append([c,j])
    return list