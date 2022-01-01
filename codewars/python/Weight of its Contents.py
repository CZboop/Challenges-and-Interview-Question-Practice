def content_weight(bottle_weight, scale):
    print(bottle_weight, scale)
    if 'larger' in scale:
        x = int("".join(list(i for i in scale if i in '1234567890')))
        return bottle_weight - bottle_weight/(x+1)
    else:
        x = int("".join(list(i for i in scale if i in '1234567890')))
        return bottle_weight / (x+1)