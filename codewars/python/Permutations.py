import itertools
def permutations(string):
    x = ["".join(i) for i in itertools.permutations(string, len(string))]
    return set(x)