def solution(n):
    count = 0
    while len(str(n)) > 1:
        n = sum(int(i) for i in str(n))
        count += 1
    return count 
