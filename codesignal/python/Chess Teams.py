def solution(smarties, cleveries):
    return [[smarties[i], cleveries[i]] for i in range(min(len(smarties), len(cleveries)))]
