def chess_board_cell_color(cell1, cell2):
    d = {"A":1,"B":2,"C":3,"D":4,"E":5,"F":6,"G":7,"H":8}
    x = abs(d.get(cell1[0]) - d.get(cell2[0]))%2==0
    y = abs(int(cell1[1]) - int(cell2[1]))%2==0
    return x==y