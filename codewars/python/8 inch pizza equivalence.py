import math
def how_many_pizzas(n):
    eight = math.pi*16
    n_area = math.pi*(n/2)**2
    pizzas = int(n_area//eight)
    try:
        slices = int(8*(n_area%eight)/eight)
    except:
        slices=0
    return "pizzas: {}, slices: {}".format(pizzas, slices)