def sort_array(source_array):    
    odd_inds = [c for c,v in enumerate(source_array) if v%2==1]
    odds = [v for c,v in enumerate(source_array) if v%2==1]
    odds.sort()

    new = []
    for c,v in enumerate(source_array):
        if c in odd_inds:
            new.append(odds[0])
            odds = odds[1:]
        else:
            new.append(source_array[c])
    return new