def solution(athletes):
    return [x for y in [j[::-1] for j in [athletes[i:i+2] for i in range(0, len(athletes), 2)]] for x in y]
