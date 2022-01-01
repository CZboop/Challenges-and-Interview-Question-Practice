def make_a_window(num): 
    layer = "|{}|{}|\n".format("."*num,"."*num)
    top = "{}\n".format("-"*(len(layer)-1))
    mid = "|{}+{}|\n".format("-"*num,"-"*num)
    window = [top]
    for i in range(num):
        window.append(layer)
    window.append(mid)
    for i in range(num):
        window.append(layer)
    window.append(top)
    return "".join(window).strip("\n")