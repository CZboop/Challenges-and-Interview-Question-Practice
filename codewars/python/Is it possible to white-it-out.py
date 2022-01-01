def white_out(st, l): 
    len_ = 0
    for i in st:
        if i in "iltf":
            len_ += 1
        else:
            len_ += 5
    diff = len_ * 2-l
    return (len_*2 <= l, abs(diff))