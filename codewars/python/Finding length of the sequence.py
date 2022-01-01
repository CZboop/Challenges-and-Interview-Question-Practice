def length_of_sequence(arr,n):
    x = [i for i,v in enumerate(arr) if v==n]
    return x[1]+1 - x[0] if len(x)==2 else 0