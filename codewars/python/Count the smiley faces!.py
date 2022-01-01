def count_smileys(arr):
    count=0
    allowed =":;-~)D"
    for i in arr:
        if i[0] in ":;" and i[-1] in ")D":
            if all(j in allowed for j in i):
                count+=1
    return count