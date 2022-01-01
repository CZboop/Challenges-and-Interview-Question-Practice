def reverse_sentence(sentence):
    words = sentence.split(" ")
    new = []
    for i in words:
        new.append(i[::-1])
    return " ".join(new)