def div_con(x):
    str_nums = sum(int(i) for i in x if isinstance(i,str))
    num_nums = sum(i for i in x if isinstance(i,int))
    return num_nums - str_nums