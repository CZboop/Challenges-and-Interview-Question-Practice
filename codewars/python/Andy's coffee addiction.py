def caffeine(coffee, number):
    d = {"decaf":0,"espresso":1,"double espresso":2,"flat white":2,"latte":1,"mocha":2}
    count = d.get(coffee)*number
    if count==0:
        return  "You haven't even had coffee today!"
    elif count<4:
        return "The doctor won't be worried yet!"
    elif count==4:
        return "You can have 2 more shots then no more!"
    elif count==5:
        return "You can only have an espresso, latte or a decaf now"
    else:
        return "Only decaf for you now!"