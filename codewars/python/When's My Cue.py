def cue(bars,instruments):
    d = {}
    splitup = bars.split("\n")
    for c,v in enumerate(instruments):
        d[v] = splitup[c].count(" ")
    return d