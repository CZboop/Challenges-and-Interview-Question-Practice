def days_until_christmas(day):
    x = date(day.year,12,25) - day
    if day.month==12 and day.day>25:
        if (day.year+1)%4==0:
            return 366+x.days
        return 365+x.days
    return x.days