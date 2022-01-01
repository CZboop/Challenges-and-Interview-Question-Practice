def grid_index(grid, indexes):
    x= [i for j in grid for i in j]
    y = "".join(x[i-1] for i in indexes if i<=len(x))
    return y