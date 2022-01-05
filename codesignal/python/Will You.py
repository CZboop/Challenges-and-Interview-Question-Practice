def solution(young, beautiful, loved):
    one = not loved and young and beautiful 
    two = not young and loved
    three =  not beautiful and loved 
    if young == True and beautiful == True and loved == True:
        return False  
    return  True in (one, two, three)

