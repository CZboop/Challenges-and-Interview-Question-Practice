def to_alternating_case(string):
    new = ""
    for i in string:
        if i.islower():
            new+=i.upper()
        elif i.isupper():
            new+=i.lower()
        else:
            new+=i
    return new