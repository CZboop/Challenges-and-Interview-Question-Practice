def solution(picture):
    new = ["{}".format("*" * int(len(picture[0])+2))]
    for i in picture:
        new.append("*{}*".format(i))
    new.append("{}".format("*" * int(len(picture[0])+2)))
    return new 
