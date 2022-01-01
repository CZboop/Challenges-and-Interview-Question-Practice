def all_continents(lst): 
    return len(set(i.get("continent") for i in lst))==5