def well(x):
    if x.count('good')>2:
        return "I smell a series!"
    elif x.count('good')>=1:
        return "Publish!"
    else:
        return "Fail!"