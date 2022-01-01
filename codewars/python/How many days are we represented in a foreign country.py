def days_represented(trips):
    x = [i for j in trips for i in range(j[0],j[1]+1)]
    return len(set(x))