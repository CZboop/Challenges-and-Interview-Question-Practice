def generate_shape(integer):
    new= ""
    for i in range(integer):
        new+="{}\n".format("+"*(integer))
    return new.strip("\n")