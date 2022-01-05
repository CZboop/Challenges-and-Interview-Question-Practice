def solution(votes, k):
    if k==0 and votes.count(max(votes))==1:
        return 1
    count = 0
    for i in sorted(votes, reverse=True):
        if i+k>max(votes):
            count+=1
        else:
            break 
    return count

