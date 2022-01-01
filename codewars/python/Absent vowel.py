def absent_vowel(x): 
    if "a" not in x.lower():
        return 0
    elif "e" not in x.lower():
        return 1
    elif "i" not in x.lower():
        return 2
    elif "o" not in x.lower():
        return 3
    elif "u" not in x.lower():
        return 4