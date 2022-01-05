def solution(bishop, pawn):
    d = {"a": 1, "b": 2, "c": 3, "d": 4, "e": 5, "f": 6, "g": 7, "h": 8}
    bishop_nums = [d.get(bishop[0]), int(bishop[1])]
    pawn_nums = [d.get(pawn[0]), int(pawn[1])]
    if abs(bishop_nums[0] - pawn_nums[0]) == abs(bishop_nums[1] - pawn_nums[1]):
        return True
    return False 
