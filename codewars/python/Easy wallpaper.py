import math
def wallpaper(l, w, h):
    if l==0 or w==0:
        return "zero"
    nums = {1:"one",2:"two",3:"three",4:"four",5:"five",6:"six",7:"seven",8:"eight",9:"nine",10:"ten",11:"eleven",12:"twelve",13:"thirteen",14:"fourteen",15:"fifteen",16:"sixteen",17:"seventeen",18:"eighteen",19:"nineteen",20:"twenty"}
    area = l*h*2 + w*h*2
    length = area/10/0.52
    return nums.get(math.ceil(length*1.15))