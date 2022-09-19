from datetime import datetime

def day_of_week(date):
    date_as_dt = datetime.strptime(date, '%d/%m/%Y')
    day_mapping = {0: 'Monday', 1: 'Tuesday', 2: 'Wednesday', 
                   3: 'Thursday', 4: 'Friday', 5: 'Saturday', 6: 'Sunday'}
    return day_mapping.get(date_as_dt.weekday())