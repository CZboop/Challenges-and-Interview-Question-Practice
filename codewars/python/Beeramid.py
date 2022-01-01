def beeramid(bonus, price):
    x = bonus//price
    count = 0
    for i in range(1,100):
        x -= i**2
        if x >= 0:
            count+=1
    return count