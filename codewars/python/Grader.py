def grader(s):
    if s>1 or s<0.6:
        x= "F"
    elif 1>=s>=0.9:
        x="A"
    elif s>=0.8:
        x="B"
    elif s>=0.7:
        x="C"
    elif s>=0.6:
        x="D"
    return x