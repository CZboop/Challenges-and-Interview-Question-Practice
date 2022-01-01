def capital(capitals): 
    new = []
    for i in capitals:
        if i.get("state"):
            new.append("The capital of {} is {}".format(i.get("state"),i.get("capital")))
        if i.get("country"):
            new.append("The capital of {} is {}".format(i.get("country"),i.get("capital")))
    return new