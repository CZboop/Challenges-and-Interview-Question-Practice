def solution(items):
    new = []
    for c,v in enumerate(items):
        if len([i for i in items[:c] if i<v])>=1:
            new.append([i for i in items[:c] if i<v][-1])
        else:
            new.append(-1)
    return new
