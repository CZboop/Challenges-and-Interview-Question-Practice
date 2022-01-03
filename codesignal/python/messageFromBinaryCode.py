def solution(code):
    spl = [code[i:i+8] for i in range(0, len(code), 8)]
    chars = "".join(chr(int(i, 2)) for i in spl)
    return chars
