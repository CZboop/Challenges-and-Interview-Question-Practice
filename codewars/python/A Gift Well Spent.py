def buy(x,arr):        
    for c,v in enumerate(arr):
        for i,j in enumerate(arr):
            if v+j==x and c!=i:
                return [c,i]