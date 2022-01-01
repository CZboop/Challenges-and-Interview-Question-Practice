def decodeMorse(morse_code):
    # ToDo: Accept dots, dashes and spaces, return human-readable message
    x =  morse_code.split(" ")
    y = [MORSE_CODE.get(i) for i in x]
    y = [" " if i==None else i for i in y]
    return "".join(y).replace("  ", " ").strip()