def fake_bin(x):
    new = ""
    for i in x:
        if int(i) <5:
            new+="0"
        elif int(i) >= 5:
            new+="1"
    return new