def heggeleggleggo(word):
    new = ""
    for i in word:
        if i.lower() in "aeiou ":
            new+=i
        else:
            new+=i+"egg"
    return new