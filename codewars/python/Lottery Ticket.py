def bingo(ticket,win):
    count = 0
    for i in ticket:
        for c,v in enumerate(i[0]):
            if str(ord(v))==str(i[1]):
                count+=1
    return "Loser!" if count<win else "Winner!"