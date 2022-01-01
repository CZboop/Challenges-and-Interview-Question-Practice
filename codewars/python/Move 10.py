def move_ten(st):
    new = ""
    for i in st:
        if ord(i)+10<=122:
            new+=chr((ord(i)+10))
        else:
            new+=chr((ord(i)-16))
    return new