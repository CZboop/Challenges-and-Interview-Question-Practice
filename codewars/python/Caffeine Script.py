def caffeine_buzz(n):
    x = ""
    if n%3==0 and n%4!=0:
        x= "Java"
    if n%3==0 and n%4==0:
        x= "Coffee"
    if len(x)>0 and n%2==0:
        x+="Script"
    elif n%3!=0:
        return "mocha_missing!"
    return x