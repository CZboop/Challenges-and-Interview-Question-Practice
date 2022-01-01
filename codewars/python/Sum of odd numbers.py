def row_sum_odd_numbers(n):
    start = n*(n-1)+1
    list = []
    for i in range(n):
        list.append(start)
        start+=2
    return sum(list)