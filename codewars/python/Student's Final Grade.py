def final_grade(exam, projects):
    if exam>90 or projects>10:
        grade=100
    elif exam>75 and projects>=5:
        grade=90
    elif exam>50 and projects>=2:
        grade=75
    else:
        grade=0
    return grade