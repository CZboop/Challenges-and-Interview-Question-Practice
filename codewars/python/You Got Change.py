def give_change(amount): 
    arr = [0,0,0,0,0,0]
    if amount>=100:
        arr[5]=arr[5]+(amount//100)
        amount = amount - (amount//100*100)
    if amount>=50:
        arr[4]=arr[4]+(amount//50)
        amount = amount - (amount//50*50)
    if amount>=20:
        arr[3]=arr[3]+(amount//20)
        amount = amount - (amount//20*20)
    if amount>=10:
        arr[2]=arr[2]+(amount//10)
        amount = amount - (amount//10*10)
    if amount>=5:
        arr[1]=arr[1]+(amount//5)
        amount = amount - (amount//5*5)
    if amount>=1:
        arr[0]=arr[0]+(amount//1)
        amount = amount - (amount//1)
    return tuple(arr)