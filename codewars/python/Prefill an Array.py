import itertools
def prefill(n=0,v="undefined"):
    try:
        return list(itertools.repeat(v,int(n)))
    except:
        return "{} is invalid".format(n)