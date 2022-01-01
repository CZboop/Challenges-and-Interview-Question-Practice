def reverse_bits(n):
    return int(str(bin(n))[::-1].replace("b0",""), 2)