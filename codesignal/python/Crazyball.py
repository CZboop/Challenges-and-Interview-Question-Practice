from itertools import combinations

def solution(players, k):
    return sorted(sorted(i) for i in combinations(players, k))
