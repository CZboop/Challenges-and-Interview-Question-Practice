def year_days(year):
    x=365
    if year%100==0 and year%400!=0:
        pass
    elif year%4==0:
        x=366
    return "{} has {} days".format(year, x)