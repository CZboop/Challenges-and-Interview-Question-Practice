def maskify(cc):
    new=""
    for i in cc[:-4]:
        new+="#"
    for i in cc[-4:]:
        new+=i
    return new