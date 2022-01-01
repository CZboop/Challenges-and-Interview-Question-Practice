def slot_machine(results):
    winnings = 0
    counts = []
    for i in results:
        x = []
        for j in "rptafd":
            x.append(i.count(j))
        counts.append(x)
    for i in counts:
        winnings-=1
        if i.count(3)==2:
            winnings+= 4
        elif max(i)==3:
            winnings+= 2
        elif max(i)==4:
            winnings+= 10
        elif max(i)==5:
            winnings+= 100
        elif max(i)==6:
            winnings+= 1000
    return winnings