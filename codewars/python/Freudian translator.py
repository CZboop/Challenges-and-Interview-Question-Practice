def to_freud(sentence):
    x = sentence.split(" ")
    y = ("sex "*len(x)).rstrip()
    return y