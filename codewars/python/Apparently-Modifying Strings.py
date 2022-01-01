def apparently(string):
    string = string.split(" ")
    for c,v in enumerate(string):
        try:
            if v in ["and","but"] and string[c+1]!="apparently":
                string.insert(c+1,"apparently")
        except:
            if v in ["and","but"]:
                string.insert(c+1,"apparently")
    return " ".join(string)