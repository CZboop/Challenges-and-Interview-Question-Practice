d = {"a":"1","e":"2","i":"3","o":"4","u":"5"}
def encode(st):
    x = ""
    for i in st:
        if i in "aeiou" and i.islower()==True:
            x+=d.get(i)
        else:
            x+=i
    return x
d2 = {"1":"a","2":"e","3":"i","4":"o","5":"u"}
def decode(st):
    y = ""
    for i in st:
        if i in "12345":
            y+=d2.get(i)
        else:
            y+=i
    return y