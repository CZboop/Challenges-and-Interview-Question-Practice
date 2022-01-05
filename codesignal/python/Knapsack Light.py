def solution(value1, weight1, value2, weight2, maxW):
    if weight1 + weight2 <= maxW:
        return value1 + value2
    else: 
        if max(weight1, weight2) <= maxW:
            return value1 if value1 > value2 else value2
        elif min(weight1, weight2) > maxW:
            return 0 
        else: 
            if value1 < value2 and weight2 <= maxW:
                return value2
            else:
                return value1 
