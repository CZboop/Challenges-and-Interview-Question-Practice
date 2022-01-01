def add_arrays(a,b): 
    if len(a)==len(b):
        try:
            return [i+j for i,j in zip(a,b)]
        except:
            raise Exception("Ooops")
    else:
        raise Exception("Ooops")