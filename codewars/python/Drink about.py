def people_with_age_drink(age):
    if age<14:
        x="toddy"
    elif age<18:
        x="coke"
    elif age<21:
        x="beer"
    else:
        x="whisky"
    return "drink {}".format(x)