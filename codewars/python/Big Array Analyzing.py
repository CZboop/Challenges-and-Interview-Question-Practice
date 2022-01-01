import numpy as np
def min_value_array(arr):
    ar = np.array(arr)
    targets = []
    for i in range(len(arr[0])):
        targets.append(min(ar[:,i]))
    return targets