from math import ceil
def num_of_trees(input, num):
    logs = 0
    for i in input:
        logs+=i[0]*i[1]
    return ceil(logs/num)