def rot13(message):
    old = [ord(i) for i in message]
    new = []
    for i in old:
        if 97<=i<=109 or 65<=i<=77:
            new.append(i+13)
        elif 110<=i<=122 or 78<=i<=90:
            new.append(i-13)
        else:
            new.append(i)
    final = [chr(i) for i in new]
    return "".join(final)