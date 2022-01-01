import itertools
def slogan_maker(array):
    return list(" ".join(i) for i in itertools.permutations(sorted(set(array),key=array.index)))