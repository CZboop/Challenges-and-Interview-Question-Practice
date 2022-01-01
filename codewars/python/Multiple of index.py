def multiple_of_index(arr):
    new=[]
    for c,i in enumerate(arr):
        try:
            if i%c==0:
                new.append(i)
        except:
            pass
    return new