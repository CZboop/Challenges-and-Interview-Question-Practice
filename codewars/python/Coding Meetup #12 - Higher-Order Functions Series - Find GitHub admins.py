def find_admin(lst, lang): 
    x = []
    for i in lst:
        if i.get("language")==lang:
            if i.get("githubAdmin")=="yes":
                x.append(i)      
    return x