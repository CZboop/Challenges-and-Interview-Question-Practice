def uncensor(infected, discovered):
    x = discovered
    for i in infected:
        while len(x)>0:
            infected = infected.replace("*",x[0],1)
            x = x[1:]
    return infected