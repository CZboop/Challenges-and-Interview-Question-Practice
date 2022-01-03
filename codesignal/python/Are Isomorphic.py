import numpy as np

def solution(array1, array2):
    array1, array2 = np.array(array1), np.array(array2)
    lens1, lens2 = [len(i) for i in array1], [len(i) for i in array2]

    return array1.shape==array2.shape and lens1==lens2
    