def correctness(bobs_decisions, expert_decisions): 
    count = 0
    for c,v in enumerate(bobs_decisions):
        if v==expert_decisions[c]:
            count+=1
        elif v=='?' or expert_decisions[c]=='?':
            count+=0.5
    return count