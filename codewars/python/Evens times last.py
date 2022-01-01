def even_last(numbers): 
    try:
        return sum(v for c,v in enumerate(numbers) if c%2==0)*numbers[-1]
    except:
        return 0