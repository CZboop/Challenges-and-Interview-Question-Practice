def multi_table(number):
    string = ""
    for i in range(1,11):
        string +="{} * {} = {}\n".format(i,number,i*number)
    return string.rstrip("\n")