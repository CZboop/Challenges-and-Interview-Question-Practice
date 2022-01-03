from itertools import permutations

def solution(players):
    return sorted(permutations(players, 2))
