def switcher(arr):
    new = ""
    for i in arr:
        if i=="27":
            new+="!"
        if i=="28":
            new+="?"
        if i=="29":
            new+=" "
        else:
            x = chr(27-int(i)+96)
            if x.isalpha():
                new+=x
    return new