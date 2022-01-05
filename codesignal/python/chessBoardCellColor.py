def solution(cell1, cell2):
    d = {"A": 1, "B":2 , "C": 3, "D": 4, "E": 5, "F": 6, "G": 7, "H": 8}
    x, y = d.get(cell1[0]), d.get(cell2[0])
    bool11, bool12 = int(cell1[1]) %2 == 0, x % 2 == 0
    black1 = bool11 == bool12
    bool21, bool22 = int(cell2[1]) % 2 == 0, y % 2 == 0
    black2 = bool21 == bool22
    return black1 == black2
