import numpy as np
def solution(mtrx):
    numpy_matrix = np.array(mtrx)
    x_index = np.where(numpy_matrix=="x")
    a_index = np.where(numpy_matrix==">")
    return True if a_index[0]==x_index[0] and a_index[1]<x_index[1] else False