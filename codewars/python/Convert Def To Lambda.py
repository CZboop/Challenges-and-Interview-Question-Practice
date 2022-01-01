def convert_def_to_lambda(string):
    name = string.split("(")[0].replace("def ","")
    var1 = string.split("(")[1].split(")")[0]
    vars = [i for i in string.split("return ")[1].split(" ")]
    new = "{} = lambda {}:".format(name, var1)
    for i in vars:
        if i=="":
            new+=" "
        else:
            new+=" "+i
    return new