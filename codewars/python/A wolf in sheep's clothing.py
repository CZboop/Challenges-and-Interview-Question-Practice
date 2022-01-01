def warn_the_sheep(queue):
    the_sheep= int(len(queue)) - int(queue.index("wolf")+1)
    if queue[-1]=="wolf":
        return "Pls go away and stop eating my sheep"
    else:
        return f"Oi! Sheep number {the_sheep}! You are about to be eaten by a wolf!"