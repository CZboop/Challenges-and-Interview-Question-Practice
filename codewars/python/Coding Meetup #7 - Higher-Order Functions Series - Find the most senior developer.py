def find_senior(lst): 
    new = [{"age":0}]
    for i in lst:
        if i.get("age")>new[0].get("age"):
            new.clear()
            new.append(i)
        elif i.get("age")==new[0].get("age"):
            new.append(i)
    return new