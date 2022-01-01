def divisions(n, divisor):
    count = 0
    while n/divisor>=1:
        count+=1
        n = n/divisor
    return count