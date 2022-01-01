def no_boring_zeros(n):
    p= str(n)
    if len(p)>0:
        while p.endswith("0"):
            p= p[:p.rfind("0")]
        try:
            return int(p)
        except:
            return 0
    else:
        return n