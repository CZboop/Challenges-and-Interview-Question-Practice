def sum_arrays(array1,array2):
    print(array1, array2)
    if len(array1)==0 or len(array2)==0:
        return max(array1,array2)
    else:
        x = int("".join(str(i) for i in array1))
        y = int("".join(str(i) for i in array2))
        z = x+y
        l = []
        for c,v in enumerate(str(z).replace("-","")):
            if c==0:
                if z<0:
                    l.append(-abs(int(str(v))))
                else:
                    l.append(int(v))
            else:
                l.append(int(v))
        return l 