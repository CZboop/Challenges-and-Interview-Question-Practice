def train(s):
    total = 0
    if s[0]=="A":
        total+=15
    if s[0]=="B":
        total+=10
    if s[0]=="C":
        total+=7
    if s[0]=="D":
        total+=8
    for i in range(s.count("_")):
        total+=5
    return total