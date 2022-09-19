def scale(strng, k, v):
    if not strng:
        return ""
    
    split = strng.split("\n")
    new_list = []
    
    for i in split:
        sub = ""
        for letter in i:
            sub += letter * k
        new_list.append("\n".join(sub for i in range(v)))
            
    return "\n".join(new_list)