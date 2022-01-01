def get_grade(s1, s2, s3):
    t = (s1+s2+s3)/3
    if t>=90:
        return "A"
    elif t>=80:
        return "B"
    elif t>=70:
        return "C"
    elif t>=60:
        return "D"
    else:
        return "F"