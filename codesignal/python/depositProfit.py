def solution(deposit, rate, threshold):
    years = 0
    while deposit < threshold:
        deposit *= (1 + (rate / 100))
        years += 1
    return years 
