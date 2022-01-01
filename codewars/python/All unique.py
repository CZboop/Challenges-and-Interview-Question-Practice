def has_unique_chars(string):    
    x = [ord(i) for i in string]
    return len(x)==len(set(x))