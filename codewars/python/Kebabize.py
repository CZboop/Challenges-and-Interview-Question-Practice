import re
def kebabize(string):
    string = "".join([i for i in string if i.isalpha()==True])
    s = re.sub(r"([A-Z])",r" \1",string).split()
    return "-".join([i.lower() for i in s])