def find_screen_height(width, ratio): 
    rw = ratio[:ratio.index(":")]
    rh = ratio[ratio.index(":")+1:]
    height = int(width/int(rw)*int(rh))
    return str(width)+"x"+str(height)