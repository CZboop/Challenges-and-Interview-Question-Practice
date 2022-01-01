def count_developers(lst):
    count = 0
    for i in lst:
        if i.get("language")=="JavaScript" and i.get("continent")=="Europe":
            count+=1
    return count