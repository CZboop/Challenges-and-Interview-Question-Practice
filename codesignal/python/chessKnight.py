def solution(cell):
    if cell[0] in "cdef" and cell[1] in "3456":
        return 8
    elif cell[0] in "cdef":
        if cell[1] in "27":
            return 6
        elif cell[1] in "18":
            return 4
    elif cell[1] in "3456":
        if cell[0] in "bg":
            return 6
        elif cell[0] in "ah":
            return 4
    elif cell in ["b7", "b2", "g7", "g2"]:
        return 4
    elif cell in ["a7", "b8", "a2", "b1", "g1", "h2", "g8", "h7"]:
        return 3
    elif cell in ["a1", "a8", "h1", "h8"]:
        return 2