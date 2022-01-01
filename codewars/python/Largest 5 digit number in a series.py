def solution(digits):
    x = []
    for c,v in enumerate(digits):
        x.append(digits[c:c+5])
    return int(max(x))