def get_real_floor(n):
    return n-1 if 0<n<13 else n-2 if n>13 else n if n<0 else 0