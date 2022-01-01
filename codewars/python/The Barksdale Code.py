def decode(string):
    d = {"1":"9","9":"1","4":"6","6":"4","7":"3","3":"7","5":"0","0":"5","2":"8","8":"2"}
    new = ""
    for i in string:
        new+=d.get(i)
    return new