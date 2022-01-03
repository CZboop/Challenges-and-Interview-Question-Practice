def solution(n):
    ops = []
    n = str(n)
    for c,v in enumerate(n):
        ops.append(n[:c]+n[c+1:])
    ops = [int(i) for i in ops]
    return max(ops)
