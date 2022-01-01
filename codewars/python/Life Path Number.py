def life_path_number(birthdate):
    year = birthdate.split("-")[0]
    month = birthdate.split("-")[1]
    day = birthdate.split("-")[2]
    while len(year)>1:
        year = str(sum(int(i) for i in year))
    while len(month)>1:
        month = str(sum(int(i) for i in month))
    while len(day)>1:
        day = str(sum(int(i) for i in day))
    total = str(int(year)+int(month)+int(day))
    while len(total)>1:
        total = str(sum(int(i) for i in total))
    return int(total)