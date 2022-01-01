def determine_winner(board):
    w = sum(i.count("W") for i in board for j in i)/len(board)
    b = sum(i.count("B") for i in board for j in i)/len(board)
    x = "W" if w>b else "B" if b>w else "T"
    tup = (x,int(max(w,b)))
    return tup