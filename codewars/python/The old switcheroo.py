def vowel_2_index(string):
    new=""
    for c,v in enumerate(string):
        if v.lower() in "aeiou":
            new+=str(c+1)
        else:
            new+=v
    return new