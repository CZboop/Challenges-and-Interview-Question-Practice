def name_value(my_list):
    new=[]
    for c,v in enumerate(my_list):
        x = 0
        for i in v:
            if i.isalpha():
                x+=ord(i)-96
        new.append(x*(c+1))
    return new