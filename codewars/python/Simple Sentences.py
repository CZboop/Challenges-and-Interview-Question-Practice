def make_sentences(parts):
    new = ""
    for i in parts:
        if i==",":
            new+=i
        elif i.isalnum():
            new+=" "
            new+=i
    new+="."
    return new.lstrip()