def solution(n):
    n = str(n)
    return sum([int(i) for i in n[:len(n) // 2]]) == sum([int(i) for i in n[len(n) // 2:]])
