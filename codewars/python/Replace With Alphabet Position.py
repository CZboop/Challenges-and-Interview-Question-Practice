def alphabet_position(text):
    new=""
    for i in text:
        if i.isalpha():
            x=(ord(i.lower())-96)
            new+=str(x)
            new+=" "
    return new.strip()