def shifter(st): 
    count = 0
    for i in set(st.split(" ")):
        if i=="":
            pass
        elif any(j in "ABCDEFGJKLPQRTUVY" for j in i):
            pass
        else:
            count+=1
    return count