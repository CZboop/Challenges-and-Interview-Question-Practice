def ETA(path):
    time = 0
    for i in path:
        if i=="-":
            time+=1
        elif i=="/":
            time+=2
        else:
            time+=0.5
    return time