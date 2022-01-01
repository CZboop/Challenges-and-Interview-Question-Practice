def is_int_array(arr):
    try:
        if isinstance(arr,list)!=True:
            return False
        else:
            return all(isinstance(i,int)==True for i in arr) or all(round(i)==i for i in arr)
    except:
        return False