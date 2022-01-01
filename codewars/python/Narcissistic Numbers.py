def is_narcissistic(x):
    narc = 0
    for i in str(x):
        narc+= int(i)**len(str(x))
    return narc==x