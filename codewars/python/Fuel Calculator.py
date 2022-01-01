def fuel_price(litres, price_per_litre):
    if litres >= 10:
        return round(litres *(price_per_litre -0.25),2)
    elif litres >= 8:
        return round(litres *(price_per_litre -0.20),2)
    elif litres >= 6:
        return round(litres *(price_per_litre -0.15),2)
    elif litres >= 4:
        return round(litres *(price_per_litre -0.10),2)
    elif litres >= 2:
        return round(litres *(price_per_litre -0.05),2)