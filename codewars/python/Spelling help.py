def switch(strng, words):
    if len(words)==0 or len(strng)==0:
        return strng
    for i in words:
        strng = strng.replace(i[0],i[1])
    return strng