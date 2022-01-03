import numpy as np
import itertools 

def solution(matrix):
    matr = np.array(matrix)
    squares = []
    for c,v in np.ndenumerate(matr):
        squares.append(matr[c[0]:c[0]+2, c[1]:c[1]+2])
    squares = [list(itertools.chain.from_iterable(i.tolist())) for i in squares]

    new = []
    for i in squares:
        if i not in new and len(i)==4:
            new.append(i)
    return len(new)
        
