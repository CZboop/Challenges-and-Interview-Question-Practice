from math import ceil
def movie(card, ticket, perc):
    print(card,ticket,perc)
    count = 0
    total = 0
    price = ticket*perc
    while ceil(card)>=total:
        count+=1
        card+=price
        total+=ticket
        price*=perc
    return count