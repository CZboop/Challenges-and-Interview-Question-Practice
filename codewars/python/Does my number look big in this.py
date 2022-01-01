def narcissistic(value):
    dig = [int(i) for i in str(value)]
    count = 0
    for i in dig:
        count+=i**len(str(value))
    return count==value