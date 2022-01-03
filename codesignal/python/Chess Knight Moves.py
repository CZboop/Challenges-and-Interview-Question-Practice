def solution(cell):
    d = {'a':1, 'b':2, 'c':3, 'd':4, 'e':5,'f':6, 'g':7, 'h':8}
    cell = [d.get(cell[0]), int(cell[1])]
    if cell[0] in range(3,7):
        if cell[1] in range(3,7):
            return 8
        elif cell[1] in [2,7]:
            return 6
        else:
            return 4
    elif cell[0] in [2,7]:
        if cell[1] in range(3,7):
            return 6
        elif cell[1] in [2,7]:
            return 4
        else:
            return 3
    else:
        if cell[1] in range(3,7):
            return 4
        elif cell[1] in [2,7]:
            return 3
        else:
            return 2
