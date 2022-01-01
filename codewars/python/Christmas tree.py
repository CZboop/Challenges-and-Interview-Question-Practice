def christmas_tree(height):
    x = height*2-1
    hohoho = ""
    for i in range(1,height+1):
        y = 2*i-1
        hohoho+="{}{}{}\n".format(" "*((x-y)//2),"*"*y," "*((x-y)//2))
    return hohoho.rstrip("\n")