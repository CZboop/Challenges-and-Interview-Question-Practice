def what_is_the_time(t):
    x = t.split(":")
    if int(x[0])==12:
        h = 11
        m = 60 - int(x[1])
    else:
        h = 11 - int(x[0])
        m = 60 - int(x[1])
    if m==0 or m==60:
        h+=1
        m="00"
    elif m<10:
        m = "0"+str(m) 
    if h==0:
        h=12
    elif h<10:
        h = "0"+str(h)  
    return "{}:{}".format(str(h),str(m))