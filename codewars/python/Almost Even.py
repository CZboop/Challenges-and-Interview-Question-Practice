def split_integer(num, parts):
    if num%parts==0:
        return [num/parts for i in range(parts)]
    else:
        x = [num//parts for i in range(parts)]
        y = num - sum(x)
        for i in range(y):
            x[i]=(num//parts+1)
        return sorted(x)