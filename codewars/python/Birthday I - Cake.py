def cake(candles,debris):
    if candles==0:
        return "That was close!"
    else:
        print(candles, debris)
        x=0
        for c,v in enumerate(debris):
            if c%2==0:
                x+=ord(v)
            else:
                x+=(ord(v)-96) 
        if x>(candles*0.7):
            return "Fire!"
        else:
            return "That was close!"