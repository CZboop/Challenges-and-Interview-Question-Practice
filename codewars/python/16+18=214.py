def add(num1, num2):
    new=[]
    num1 = str(num1)
    num2 = str(num2)
    x = max(len(num1),len(num2))
    if len(num1)!=len(num2):
        num1 = "{}{}".format("0"*(x-len(num1)),num1)
        num2 = "{}{}".format("0"*(x-len(num2)),num2)
    print(num1,num2)
    for r in range(len(num1)):
        new.insert(0,int(num1[r])+int(num2[r]))
    return int("".join(str(i) for i in reversed(new)))