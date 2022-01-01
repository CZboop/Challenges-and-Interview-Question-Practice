def is_same_language(lst): 
    return len(set([i.get("language") for i in lst]))==1