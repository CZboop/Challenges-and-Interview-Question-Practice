def get_average(lst): 
    ages = [i.get("age") for i in lst]
    return round(sum(ages)/len(ages))