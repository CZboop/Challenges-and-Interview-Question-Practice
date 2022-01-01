def insurance(age, size, num_of_days): 
    if size not in ['economy', 'medium', 'full-size']:
        size = 'full-size'
    if num_of_days < 0:
        return 0
    daily = 50
    if age<25:
        daily+=10
    if size=='medium':
        daily+=10
    if size=='full-size':
        daily+=15
    return daily*num_of_days