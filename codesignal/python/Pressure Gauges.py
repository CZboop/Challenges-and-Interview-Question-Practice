def solution(morning, evening):
    return [min(i) for i in zip(morning, evening)], [max(i) for i in zip(morning, evening)]
