def to_weird_case(string):
    new = ""
    string = string.split()
    for i in string:
        for c,v in enumerate(i):
            if c%2==0:
                new+=v.upper()
            else:
                new+=v.lower()
        new+=" "
    return new.strip()