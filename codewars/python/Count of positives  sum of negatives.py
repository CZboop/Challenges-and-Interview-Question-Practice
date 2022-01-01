def count_positives_sum_negatives(arr):
    if len(arr)>0:
        sum = 0
        count= 0
        for i in arr:
            if i>0:
                count+=1
            elif i<0:
                sum+=i
        return [count, sum] 
    else:
        return []