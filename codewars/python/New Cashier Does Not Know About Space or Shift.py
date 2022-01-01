def get_order(order):
    menu=["Burger","Fries","Chicken","Pizza","Sandwich","Onionrings","Milkshake","Coke"]
    new = []
    for x in [x.lower() for x in menu]:
        if x in order:
            for y in range(order.count(x)):
                new.append(x)
    return " ".join(i.capitalize() for i in new)