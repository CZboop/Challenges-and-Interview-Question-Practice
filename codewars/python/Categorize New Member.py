def open_or_senior(data):
    new = []
    for i in data:
        if int(i[0])>=55:
            if int(i[1])>7:
                new.append("Senior")
            else:
                new.append("Open")
        else:
            new.append("Open")
    return new