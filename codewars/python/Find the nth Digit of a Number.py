def find_digit(num, nth):
    num = abs(num)
    if nth<=0:
        return -1
    else:
        try:
            x = str(num)[::-1]
            return int(x[nth-1])
        except:
            return 0