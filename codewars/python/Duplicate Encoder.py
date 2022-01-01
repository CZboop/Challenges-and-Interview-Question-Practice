def duplicate_encode(word):
    new = ""
    word = word.lower()
    for i in word:
        if word.count(i)>1:
            new+=")"
        else:
            new+="("
    return new