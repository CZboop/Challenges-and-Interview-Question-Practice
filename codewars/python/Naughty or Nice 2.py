def naughty_or_nice(data):
    count = 0
    for month in data:
        for day in data[month]:
            if data[month][day]=="Nice":
                count+=1
            else:
                count-=1
    return "Nice!" if count>=0 else "Naughty!"