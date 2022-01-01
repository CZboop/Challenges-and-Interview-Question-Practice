def restaurant(single_tables, double_tables, visitors):
    double_one = 0
    denied = 0
    for i in visitors:
        if i==1:
            if single_tables>0:
                single_tables-=1
            elif double_tables>0:
                double_tables-=1
                double_one +=1
            elif double_one>0:
                double_one-=1
            else:
                denied+=1
        elif i==2:
            if double_tables>0:
                double_tables-=1
            else:
                denied+=2
    return denied