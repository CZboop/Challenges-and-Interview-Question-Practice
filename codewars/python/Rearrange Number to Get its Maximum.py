def max_redigit(num): 
    if len(str(num))==3 and num>0:
        return int("".join(sorted(str(num), reverse=True)))
    else:
        return None