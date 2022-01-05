def solution(n):
    return all(int(i) % 2 == 0 for i in str(n))
