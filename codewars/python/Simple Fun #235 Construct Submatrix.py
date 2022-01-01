import numpy as np
def construct_submatrix(matrix, rows_to_delete, cols_to_delete):
    arr = np.array(matrix)
    arr = np.delete(arr,rows_to_delete,0)
    arr = np.delete(arr,cols_to_delete,1)
    return arr.tolist()