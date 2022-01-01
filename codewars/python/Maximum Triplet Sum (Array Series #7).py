def max_tri_sum(numbers):
    numbers = set(numbers)
    s = 0
    for i in range(3):
        s+=max(numbers)
        numbers.remove(max(numbers))
    return s