from itertools import permutations, islice

def solution(numbers, k):
    return list(sorted(islice(permutations(numbers, len(numbers)), k)))[-1]
