def move_zeros(array):
    new = []
    zeros = []
    for i in array:
        if i==0 and str(i)!="False":
            zeros.append(i)
        else:
            new.append(i)
    return new+zeros