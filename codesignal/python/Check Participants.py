def solution(participants):
    return [c for c,v in enumerate(participants) if c>v]
