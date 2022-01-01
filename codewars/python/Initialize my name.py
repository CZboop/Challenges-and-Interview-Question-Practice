def initialize_names(name):
    splitted =name.split(" ") 
    new = ""
    if len(splitted)>2:
        new+=splitted[0]
        new+=" "
        for i in range(1,len(splitted)-1):
            new+=splitted[i][0]
            new+=". "
        new+=splitted[-1]
        return new
    else:
        return name