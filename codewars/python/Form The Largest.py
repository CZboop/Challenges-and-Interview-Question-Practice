import itertools
def max_number(n):
    x= [int("".join(i)) for i in itertools.permutations(str(n),len(str(n)))]
    return max(x)