def rot13(message):
    new = ""
    for i in message:
        if i.isalpha():
            if 97 <= ord(i) <= 109:
                new += chr(ord(i) + 13)
            elif 122 >= ord(i) >= 110:
                new += chr(ord(i) - 13)
            elif 65 <= ord(i) <= 77:
                new += chr(ord(i) + 13)
            elif 78 <= ord(i) <= 90:
                new += chr(ord(i) - 13)
        else:
            new += i
    return new