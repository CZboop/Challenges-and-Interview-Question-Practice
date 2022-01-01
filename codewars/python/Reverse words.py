def reverse_words(text):
    x = text.split(" ")
    new = []
    for i in x:
        new.append(i[::-1])
    return " ".join(new)