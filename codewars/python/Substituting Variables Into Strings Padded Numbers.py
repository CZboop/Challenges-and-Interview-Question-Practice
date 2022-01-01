def solution(value):
    x = "0"*(5-len(str(value)))+str(value)
    return "Value is {}".format(x)