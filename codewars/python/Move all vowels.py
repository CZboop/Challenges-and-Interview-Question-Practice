def move_vowels(input): 
    x = "".join([i for i in input if i not in "aeiou"])
    for c,v in enumerate(input):
        if v in "aeiou":
            x+=v
    return x