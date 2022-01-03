def solution(male, female):
    return [[v for c,v in enumerate(male) if female[c]!=v] , [v for c,v in enumerate(female) if male[c]!=v]]
