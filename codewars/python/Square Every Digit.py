def square_digits(num):
    current= ""
    for i in str(num):
        current+= str(int(i)*int(i))
    return int(current)