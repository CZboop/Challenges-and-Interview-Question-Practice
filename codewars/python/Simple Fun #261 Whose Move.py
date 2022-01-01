def whoseMove(lastPlayer, win):
    if lastPlayer=="white":
        return "white" if win==True else "black"
    else:
        return "black" if win==True else "white"