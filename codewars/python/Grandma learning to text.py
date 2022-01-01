import re
def textin(str):
    new = re.compile(re.escape(r'two'),re.IGNORECASE)
    x = new.sub("2", str)
    newer = re.compile(re.escape(r'too'),re.IGNORECASE)
    y = newer.sub("2",x)
    newest = re.compile(re.escape(r'to'),re.IGNORECASE)
    z = newest.sub("2",y)
    return z