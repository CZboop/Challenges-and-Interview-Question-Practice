def solution(lastNumberOfDays):
    days = []
    months = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    for c,v in enumerate(months[:-1]):
        if v == lastNumberOfDays:
            days.append(months[c+1])
    days_new = []
    for i in days:
        if i not in days_new:
            days_new.append(i)
    return days_new
