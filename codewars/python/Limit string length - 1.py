def solution(st, limit): 
    if len(st)<=limit:
        return st
    else:
        return st[:limit]+"..."