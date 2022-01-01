def greet_developers(lst): 
    for i in lst:
        i['greeting'] = "Hi {}, what do you like the most about {}?".format(i.get('firstName'), i.get('language'))  
    return lst