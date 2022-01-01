def middle_me(N, X, Y): 
    if N%2==0:
        return f'{N//2*Y}{X}{N//2*Y}'
    else:
        return X