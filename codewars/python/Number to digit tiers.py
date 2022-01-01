def create_array_of_tiers(n):
    return [str(n)[:i] for i in range(1,len(str(n))+1)]