def solution(a, b):
    inds = []
    
    x = [a.count(i) for i in sorted(set(a))]
    y = [b.count(i) for i in sorted(set(b))]

    for c,v in enumerate(a):
        if v!=b[c]:
            inds.append(c)

    return len(inds) in [0,2] and set(a)==set(b) and x==y
