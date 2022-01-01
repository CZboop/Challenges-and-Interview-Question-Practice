def twos_difference(lst): 
    new = []
    for i in lst:
        for j in lst:
            if i!=j:
                if j+2==i or i+2==j:
                    new.append((min(i,j),max(i,j)))
    return sorted([i for i in set(new)])