def shorter_reverse_longer(a,b):
    if len(a)==len(b):
        return b+a[::-1]+b
    else:
        return min((a,b),key=len)+max((a,b),key=len)[::-1]+min((a,b),key=len)