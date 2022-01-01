def special_number(number):
    if all(i in "012345" for i in str(number)):
        return "Special!!"
    else:
        return "NOT!!"