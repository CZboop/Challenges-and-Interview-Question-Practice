def cube_odd(arr):
    try:
        if "True" not in str(arr) and "False" not in str(arr):
            new = [i**3 for i in arr]
            return sum(i for i in new if i%2!=0)
        else:
            return None
    except:
        return None