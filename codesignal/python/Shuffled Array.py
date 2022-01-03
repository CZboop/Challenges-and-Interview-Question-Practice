def solution(shuffled):
    total = None
    for c,v in enumerate(shuffled):
        if sum(shuffled) - v == v:
            total = v 
            shuffled.pop(c)
            break
    return sorted(shuffled) 
