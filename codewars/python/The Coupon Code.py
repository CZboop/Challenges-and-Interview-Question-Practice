from datetime import datetime

def check_coupon(entered_code, correct_code, current_date, expiration_date):
    if entered_code != correct_code or type(entered_code) != str:
        return False

    current_datetime = datetime.strptime(current_date.replace(",",""), '%B %d %Y')
    expiration_datetime = datetime.strptime(expiration_date.replace(",",""), '%B %d %Y')
    
    return current_datetime <= expiration_datetime 