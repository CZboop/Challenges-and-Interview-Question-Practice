def string_breakers(n, st): 
    st = st.replace(" ","")
    x = (st[0+i:n+i] for i in range(0,len(st),n))
    y = ""
    for i in x:
        y+=i +"\n"
    return y.strip("\n")