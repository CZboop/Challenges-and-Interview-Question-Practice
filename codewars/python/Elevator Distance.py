def elevator_distance(array):
    sum_ = 0
    for c,v in enumerate(array):
        try:
            sum_+=abs(v-array[c+1])
        except:
            pass
    return sum_