def draw_stairs(n):
    stairs=""
    for i in range(n):
        stairs+="{}I\n".format(" "*i)
    return stairs.rstrip("\n")