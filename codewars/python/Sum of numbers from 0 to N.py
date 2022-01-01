def show_sequence(n):
    if n==0:
        return "0=0"
    if n>0:
        return "+".join([str(i) for i in range(n+1)]) +" = "+ str(sum(range(n+1)))
    else:
        return str(n)+"<0"