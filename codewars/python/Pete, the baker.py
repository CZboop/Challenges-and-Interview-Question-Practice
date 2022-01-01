def cakes(recipe, available):
    try:
        x = []
        for i in recipe.keys():
            x.append(available.get(i)//recipe.get(i))
        return min(x)
    except:
        return 0