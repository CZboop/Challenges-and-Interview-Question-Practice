def star_sign(date): 
    month = date.month
    day = date.day
    if month==1 and day>=21:
        return "Aquarius"
    if month==2 and day<=19:
        return "Aquarius"
    if month==2 and day>=20:
        return "Pisces"
    if month==3 and day<=20:
        return "Pisces"
    if month==3 and day>=21:
        return "Aries"
    if month==4 and day<=20:
        return "Aries"
    if month==4 and day>=21:
        return "Taurus"
    if month==5 and day<=21:
        return "Taurus"
    if month==5 and day>=22:
        return "Gemini"
    if month==6 and day<=21:
        return "Gemini"
    if month==6 and day>=22:
        return "Cancer"
    if month==7 and day<=22:
        return "Cancer"
    if month==7 and day>=23:
        return "Leo"
    if month==8 and day<=23:
        return "Leo"
    if month==8 and day>=24:
        return "Virgo"
    if month==9 and day<=23:
        return "Virgo"
    if month==9 and day>=24:
        return "Libra"
    if month==10 and day<=23:
        return "Libra"
    if month==10 and day>=24:
        return "Scorpio"
    if month==11 and day<=22:
        return "Scorpio"
    if month==11 and day>=23:
        return "Sagittarius"
    if month==12 and day<=21:
        return "Sagittarius"
    if month==12 and day>=22:
        return "Capricorn"
    if month==1 and day<=20:
        return "Capricorn"