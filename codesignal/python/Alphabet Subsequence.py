def solution(s):
    ords = [ord(i) for i in s]
    return ords == sorted(set(ords))
