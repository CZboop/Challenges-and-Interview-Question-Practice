def fillable(stock, merch, n):
    try:
        return stock[merch]>=n
    except:
        return False