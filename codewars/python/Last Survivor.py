def last_survivor(letters, coords):
    letters = [i for i in letters]
    for i in coords:
        letters.pop(i)
    return letters[0]