def solution(n):
    return len(str(n)) - len(str(n).rstrip("0")) != str(n).count("0")
 