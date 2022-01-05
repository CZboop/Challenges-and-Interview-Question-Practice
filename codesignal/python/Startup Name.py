def solution(companies):
    cmp1 = set(companies[0])
    cmp2 = set(companies[1])
    cmp3 = set(companies[2])
    res = list(cmp1) + list(cmp2) + list(cmp3)
    res = set([i for i in res if res.count(i) == 2])
    return list(sorted(list(res)))
