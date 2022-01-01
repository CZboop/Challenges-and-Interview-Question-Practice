def the_janitor(word):
    new = []
    for i in 'abcdefghijklmnopqrstuvwxyz':
        try:
            new.append(word.rfind(i) - word.index(i)+1)
        except:
            new.append(0)   
    return new