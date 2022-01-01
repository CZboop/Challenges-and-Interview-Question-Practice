def convert(number):
    letters = [number[i:i+2] for i in range(0,len(number),2)]
    return "".join([chr(int(i)) for i in letters])