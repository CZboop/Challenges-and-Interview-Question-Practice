def pass_the_door_man(word): 
    letter = ''
    for c,v in enumerate(word[:-1]):
        for i,j in enumerate(word[1:]):
            if c==i and v==j:
                letter = j
    return (ord(letter.lower())-96)*3