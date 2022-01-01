def check_exam(arr1,arr2):
    score = 0
    for count,val in enumerate(arr2):
        if val == arr1[count]:
            score += 4
        elif val != arr1[count] and val!="":
            score -= 1
        else:
            score += 0
    return score if score > 0 else 0