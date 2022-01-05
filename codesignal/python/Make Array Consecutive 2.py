def solution(statues):
    return len([i for i in range(min(statues),max(statues)) if i not in statues])
