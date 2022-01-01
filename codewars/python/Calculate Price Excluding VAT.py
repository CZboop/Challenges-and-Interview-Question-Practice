def excluding_vat_price(price):
    try:
        return round(price/115*100,2)
    except:
        return -1