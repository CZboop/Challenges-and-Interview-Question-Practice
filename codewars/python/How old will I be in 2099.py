def calculate_age(year_of_birth, current_year):
    age = current_year - year_of_birth
    return "You are {} year{} old.".format(age, "s" if age!=1 else "") if age>0 else "You will be born in {} year{}.".format(abs(age),"s" if abs(age)!=1 else "") if age<0 else "You were born this very year!"