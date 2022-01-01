def Hangman(guess, word):
    new = ""
    for i in word:
        if i.lower()==guess.lower():
            new+=i.lower()
        else:
            new+="_"
    return new