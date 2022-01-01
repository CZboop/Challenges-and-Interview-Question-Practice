import re
def title_case(title, minor_words=''):
    new = ""
    lst = title.split()
    min = minor_words.split()
    min = [i.lower() for i in min]
    if len(lst)>0:
        new+= lst[0].capitalize()+" "
        for i in lst[1:]:
            if i.lower() not in min:
                new+=i.capitalize()+" "
            else:
                new+=i.lower()+" "
        return new.strip(" ")
    else:
        return title