def up_array(arr):
    try:
        if all(len(str(i))==1 for i in arr):
            arr = [str(i) for i in arr]
            x = "".join(arr)
            return [int(i) for i in str(int(x)+1)]
        else:
            return None
    except:
        return None