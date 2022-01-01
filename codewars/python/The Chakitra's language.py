def chakitra_language(sentence):
    words = sentence.split(" ")
    max_letters = []
    ords = [[ord(j) for j in i] for i in words]
    for i in ords:
        max_letters.append(max(i)-96)
    return all(i%2==0 for i in max_letters)