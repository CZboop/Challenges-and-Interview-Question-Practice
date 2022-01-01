def match_words(acronym,words):
    d = {}
    for i in words:
        for j in acronym:
            if i[0]==j:
                d[j] = i
    return d