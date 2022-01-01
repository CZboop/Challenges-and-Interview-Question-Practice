def rgb(r, g, b):
    if 0<=r<=255 and 0<=g<=255 and 0<=b<=255:
        return ('%02x%02x%02x' % (r,g,b)).upper() 
    else:
        x = ""
        if r<0:
            x +="00"
        elif r>255:
            x+= "FF"
        else:
            x+=str("%02x"%r).upper()
        if g<0:
            x+="00"
        elif g>255:
            x+="FF"
        else:
            x+=str("%02x"%g).upper()
        if b<0:
            x+="00"
        elif b>255:
            x+="FF"
        else:
            x+=str("%02x"%b).upper()
        return x