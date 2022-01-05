def solution(score1, score2):
    if max(score1, score2) == 6:
        return min(score1, score2) <= 4
    elif max(score1, score2) > 6:
        return max(score1, score2) == 7 and max(score1, score2) - min(score1, score2) in (1,2)
    else:
        return False 