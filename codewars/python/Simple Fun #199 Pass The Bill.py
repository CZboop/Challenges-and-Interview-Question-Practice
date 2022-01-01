def pass_the_bill(tm, cpm, rpm):
    ipm = tm-cpm-rpm
    if cpm>tm/2:
        return 0
    if (tm/2) >=(cpm+ipm):
        return -1
    else:
        if tm%2==0:
            return (tm/2)+1 - cpm
        else:
            return (tm+1)/2 - cpm