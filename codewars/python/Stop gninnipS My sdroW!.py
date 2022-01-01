def spin_words(sentence):
    sentence = sentence.split()
    new=[]
    for i in sentence:
        if len(i)>=5:
            new.append(i[::-1])
        else:
            new.append(i)
    return " ".join(new)