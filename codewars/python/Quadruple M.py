def list_mix(ls):
    if len(ls)%2==0:
        median = round(((sorted(ls)[len(ls)//2-1] + sorted(ls)[len(ls)//2])/2),2) 
    else:
        median = round((sorted(ls)[len(ls)//2]),2)
    return [round(max(ls),2), round(min(ls),2), median, round(sum(ls)/len(ls),2)]