def anagrams(word, l):
    return [i for i in l if sorted(i)==sorted(word)]