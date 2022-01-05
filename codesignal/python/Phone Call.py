def solution(min1, min2_10, min11, s):
    if s >= min1 + min2_10 * 9 + min11:
        return 10 + (s - (min1 + min2_10 * 9)) // min11
    else:
        if s < min1:
            return 0
        elif s < min1 + min2_10:
            return 1
        elif s == min1 + min2_10 * 9:
            return 10
        else:
            return 1 + (s - min1) // min2_10
