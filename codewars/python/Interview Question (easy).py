def get_strings(city):
    new = ""
    for i in city.lower():
        if i not in new and i.isalpha():
            new+="{}:{},".format(i,"*"*city.lower().count(i))
    return new.rstrip(",")