def weather_info (temp):
    c = (temp-32)*(5/9)
    if c < 0:
        return str(c) + " is freezing temperature"
    else:
        return str(c) + " is above freezing temperature"
    
def convert_to_celsius (temperature):
    celsius = (temperture) - 32 + (5/9)
    return celsius