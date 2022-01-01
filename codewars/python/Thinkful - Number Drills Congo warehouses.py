def box_capacity(length, width, height):
    length, width, height = length*12, width*12, height*12
    l, w, h = length//16, width//16, height//16
    return l * w * h