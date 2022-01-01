from datetime import date

def age_in_days(year, month, day):
    today = date.today()
    birthday = date(year,month,day)
    delta = today - birthday
    return "You are {} days old".format(delta.days)