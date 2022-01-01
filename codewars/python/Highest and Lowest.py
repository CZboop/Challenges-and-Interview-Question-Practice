def high_and_low(numbers):
    num_list = numbers.split(" ")
    return max(num_list, key=int) + " "+min(num_list, key=int)