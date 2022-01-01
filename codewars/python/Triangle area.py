def t_area(t_str):
    splitup = t_str.split("\n")[1:-1]
    return (len(splitup[-1])//2*(len(splitup)-1))/2