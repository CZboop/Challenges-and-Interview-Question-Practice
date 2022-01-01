def average(x):
    if isinstance(x,str):
        return "Incorrect"
    else:
        return sum(x)//len(x)