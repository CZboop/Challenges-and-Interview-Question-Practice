def validate_pin(pin):
    return pin.isdecimal() if len(pin)==4 or len(pin)==6 else False