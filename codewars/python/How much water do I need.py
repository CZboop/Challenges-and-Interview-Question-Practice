def how_much_water(water, load, clothes):
    if clothes>load*2:
        return "Too much clothes"
    elif clothes<load:
        return "Not enough clothes"
    else:
        if clothes>=load:
            return round(water*1.1**(clothes-load),2)
        else:
            return round(float(load*water), 2)