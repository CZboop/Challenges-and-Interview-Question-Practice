def battle(x, y):
    xp = 0
    yp = 0
    for i in x:
        xp+=ord(i)-64
    for i in y:
        yp+=ord(i)-64
    return x if xp>yp else y if yp>xp else 'Tie!'